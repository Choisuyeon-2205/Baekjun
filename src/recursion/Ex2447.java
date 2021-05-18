package recursion;

import java.util.Scanner;

public class Ex2447 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		printStar(sc.nextInt());

	}

	private static void printStar(int n) {
		for(int j=1; j<=n; j++) {
			for(int i=1; i<=n/3; i++) {
				if(j>n/3&&j<=2*n/3&&i>n/9&&i<=2*n/9) {
					System.out.print("   ");
				}else if((j%9==4||j%9==5||j%9==6)&&i%3==2)
					System.out.print("   ");
				else if(j%3!=2)
					System.out.print("***");
				else
					System.out.print("* *");
			}
			System.out.println();
		}
		
	}
}

