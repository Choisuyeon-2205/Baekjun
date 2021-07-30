package stack;

import java.util.Scanner;
import java.util.Stack;

public class Ex1874 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		Stack<Integer> stack= new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int i=0;
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int j=1;
		for(int a: arr) { //6
			for(int k=j;j<=a;j++) { //5-6
				stack.push(j);
				sb.append("+\n");
			}
			if(j<a) j=a+1; //j=7
			
			if(a==stack.peek()) {
				stack.pop();
				sb.append("-\n");
			}else {
				sb.setLength(0);
				sb.append("NO");
				break;
			}
		}
		System.out.println(sb);
	}

}
