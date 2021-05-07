package math2;

import java.util.Scanner;

public class Ex9020 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int c= sc.nextInt();
		int n=0;
		
		for(int i=0; i<c; i++) {
			n= sc.nextInt();
			print_prime(n);
		}

	}
	
	private static int isSosu(int i) {
		int result= 1;
		if(i==1) return 0;
		if(i==2) return 1;
		for(int j=2; j<=Math.sqrt(i); j++) {
			if(i%j==0) {
				result= 0;
				break;
			}
		}
		
		return result;
	}

	private static void print_prime(int n) {
		for(int i=n/2;i>0;i--) {
			if(isSosu(i)==1) {
				if(isSosu(n-i)==1) {
					System.out.println(i+" "+(n-i));
					break;
				}
			}
		}
		
	}

}
