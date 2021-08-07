package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex2164 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt(); //n 입력받기
		
		Queue<Integer> que= new LinkedList<Integer>();
		for(int i=1;i<=n;i++) {
			que.add(i);
		}
		
		while(que.size()>1) {
			que.poll();
			if(que.size()<=1)
				break;
			int num= que.poll();
			que.add(num);
		}
		
		System.out.println(que.poll());
	}
}
