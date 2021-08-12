package queue;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex1966 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int case_num= sc.nextInt();

		for(int i=0;i<case_num;i++) { //테스트 케이스만큼 실행
			
			int num= sc.nextInt();
			int idx= sc.nextInt();
			LinkedList<int[]> que= new LinkedList<>();
			
			for(int j=0;j<num;j++) {
				que.add(new int[] {j, sc.nextInt()});
			}

			int seq=0;		

			while(!que.isEmpty()){ // (1) 3 1 2
				int[] score= que.poll();
				boolean isMax = true;	// front 원소가 가장 큰 원소인지를 판단하는 변수

				// 큐에 남아있는 원소들과 중요도를 비교 
				for(int j = 0; j < que.size(); j++) {

					// 처음 뽑은 원소보다 큐에 있는 j번째 원소가 중요도가 클 경우 
					if(score[1] < que.get(j)[1]) {

						// 뽑은 원소 및 j 이전의 원소들을 뒤로 보낸다.
						que.offer(score);
						for(int z = 0; z < j; z++) {
							que.offer(que.poll());
						}

						// score원소가 가장 큰 원소가 아니였으므로 false를 하고 탐색을 마침
						isMax = false;
						break;
					}
				}

				// front 원소가 가장 큰 원소가 아니였으므로 다음 반복문으로 넘어감
				if(isMax == false) {
					continue;
				}

				// front 원소가 가장 큰 원소였으므로 해당 원소는 출력해야하는 문서다.
				seq++;
				if(score[0] == idx) {	// 찾고자 하는 문서라면 해당 테스트케이스 종료
					break;
				}
			}
			sb.append(seq).append('\n');
		}
		System.out.println(sb);
	}
}
