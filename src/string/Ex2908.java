package string;

import java.util.Scanner;

public class Ex2908 {

	public static void main(String[] args) {
		String num1, num2;
		String new_num1="", new_num2="";
		Scanner sc= new Scanner(System.in);
		num1= sc.next();
		num2= sc.next();
		
		for(int i=num1.length()-1; i>=0; i--) {
			new_num1+=num1.charAt(i);
			new_num2+=num2.charAt(i);
		}

		if(Integer.parseInt(new_num2)>Integer.parseInt(new_num1))
			System.out.println(new_num2);
		else
			System.out.println(new_num1);
	}
}
