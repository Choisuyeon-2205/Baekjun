package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11866 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt(); //n 입력받기
		int k= sc.nextInt(); //k 입력받기
		
		Queue<Integer> que= new LinkedList<Integer>();
		int idx= k;
		while(que.size()<n) {
			que.add(idx); //3 6 2
			
			int i=0;
			while(i<k) {
			}
			
		}
	}

}
