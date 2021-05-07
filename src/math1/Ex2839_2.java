package math1;

import java.util.Scanner;

public class Ex2839_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
	
		System.out.println(deliver(n)!=0?deliver(n):-1);
	}

	private static int deliver(int n) {
		int su1=0, su2=0;

		for(int x=0; x<1667;x++) {
			for(int y=0; y<1000;y++) {
				if((3*x)+(5*y)==n) {
					if((su1+su2>x+y)||(su1==0&&su2==0)) {
						su1= x;
						su2= y;
					}
				}
				if(3*x+5*y>n) break;
			}
		}
		return su1+su2;
	}
}
