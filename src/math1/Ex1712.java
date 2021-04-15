package math1;

import java.util.Scanner;

public class Ex1712 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int i=0;
		
		if(b>=c) i=-1;
		else {
			i= a/(c-b)+1; 
//			while((c-b)*i<=a) {
//				i++;
//			}
		}
		System.out.println(i);

	}

}
