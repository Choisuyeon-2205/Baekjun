package math2;

import java.util.Scanner;

public class Ex11653 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();

		for(int i=2; i<=Math.sqrt(num); i++) {
			while(num%i==0) {
				num/=i;
				System.out.println(i);
			}	
		}
		if(num!=1) System.out.println(num);

	}
}
