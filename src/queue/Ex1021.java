package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Ex1021 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());

		int n= Integer.parseInt(st.nextToken());
		int m= Integer.parseInt(st.nextToken());

		LinkedList<Integer> deque= new LinkedList<Integer>();
		for(int i=1;i<=n;i++)
			deque.offerLast(i);

		int[] arr= new int[m];
		st= new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++)
			arr[i]= Integer.parseInt(st.nextToken());

		int cnt=0; 
		for(int i=0;i<m;i++) {
			// 덱에서 뽑고자 하는 숫자의 위치(index) 찾기 
			int target_idx = deque.indexOf(arr[i]);
			int half_idx;

			if(deque.size() % 2 == 0) {
				half_idx = deque.size() / 2 - 1;
			}
			else {
				half_idx = deque.size() / 2;
			}

			// 중간 지점 또는 중간 지점보다 원소의 위치가 앞에 있을 경우
			if(target_idx <= half_idx) {
				// idx 보다 앞에 있는 원소들을 모두 뒤로 보낸다. (2번 연산)
				for(int j = 0; j < target_idx; j++) {
					int temp = deque.pollFirst();
					deque.offerLast(temp);
					cnt++;
				}
			}
			else {	// 중간 지점보다 원소의 위치가 뒤에 있는 경우 
				// idx를 포함한 뒤에 있는 원소들을 모두 앞으로 보낸다. (3번 연산)
				for(int j = 0; j < deque.size() - target_idx; j++) {
					int temp = deque.pollLast();
					deque.offerFirst(temp);
					cnt++;
				}

			}
			deque.pollFirst();
		}

		System.out.println(cnt);
	}

}
