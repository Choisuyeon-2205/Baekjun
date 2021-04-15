package string;

import java.util.Scanner;

public class Ex1152 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String line= sc.nextLine();
		
		line= line.trim();
		
		if(line.isEmpty()) 
			System.out.println(0);
		else
			System.out.println(line.split(" ").length);	
	}
}
