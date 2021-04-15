package math1;

import java.util.Scanner;

public class Ex2292 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int end= sc.nextInt();

		int i=0;
		while(3*i*(i+1)+1<end) {
			i++;
		}
		System.out.println(i+1);
	}

}
