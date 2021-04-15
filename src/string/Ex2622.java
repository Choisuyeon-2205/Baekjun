package string;

import java.util.Scanner;

public class Ex2622 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		int dial=0, total=0;

		for(int i=0; i<str.length(); i++) {
			int num= str.charAt(i)-65; // ascii 65-90
			if(num==18) dial=7;
			else if(num==21) dial=8;
			else if(num>=22) dial=9;
			else dial=(num/3)+2;
			
			total+=dial;
		}
		
		System.out.println(total+str.length());
		
	}

}
