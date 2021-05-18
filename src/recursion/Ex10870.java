package recursion;

import java.util.Scanner;

public class Ex10870 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(fibonacci(sc.nextInt()));

	}

	private static int fibonacci(int n) {
		if(n==0) return 0;
		else if(n==1) return 1;
		else return fibonacci(n-1)+fibonacci(n-2);
	}

}
