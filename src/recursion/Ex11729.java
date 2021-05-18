package recursion;

import java.util.Scanner;

public class Ex11729 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println((int)Math.pow(2, n)-1);
		print_hanoi(n);
	}

	private static void print_hanoi(int n) {
		if(n==1) {
			System.out.println("1 3");
		}else if(n==2) {
			System.out.println("1 2");
			System.out.println("1 3");
			System.out.println("2 3");
		}else {
			print_hanoi(n-2);

			print_hanoi(n-2);

			print_hanoi(n-2);
		}
	}

}
