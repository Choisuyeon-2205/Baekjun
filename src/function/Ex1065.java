package function;

import java.util.Scanner;

public class Ex1065 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();

		int result= hansu(n);
		System.out.println(result);	
	}

	private static int hansu(int n) {
		int count= 0;
		int ja1,ja2,ja3;

		if(n<100)
			count= n;
		else {
			count+=99;
			for(int i=100; i<=n;i++) {
				ja1= i%10;
				ja2= (i/10)%10;
				ja3= i/100;

				if(ja1-ja2==ja2-ja3) {
					count++;
				}		
			}
		}
		return count;
	}
}
