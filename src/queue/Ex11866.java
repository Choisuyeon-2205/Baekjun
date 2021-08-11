package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11866 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		StringBuilder sb= new StringBuilder();
		sb.append("<");
		int n= sc.nextInt(); //n 입력받기
		int k= sc.nextInt(); //k 입력받기
		
		Queue<Integer> que= new LinkedList<Integer>();
		
		for(int i=1;i<=n;i++) {
			que.add(i); //1-n 까지 수를 큐에 삽입
		}
		
		while(que.size() > 1) {
			
			for(int i = 0; i < k - 1; i++) {
				int val = que.poll();
				que.offer(val);
			}
			
			sb.append(que.poll()).append(", ");
		}
 
		// 마지막 원소 출력한 뒤 > 도 붙여준다.
		sb.append(que.poll()).append(">");
		System.out.println(sb);
		
	}

}
