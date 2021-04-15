package string;

import java.util.Scanner;

public class Ex2675 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int total_count= sc.nextInt();

		for(int k=0; k<total_count; k++) {
			int count= sc.nextInt();
			String str= sc.next();
			String new_str= "";

			for(int j=0; j<str.length(); j++) {
				for(int i=0; i<count; i++) {
					new_str+=str.charAt(j);
				}
			}

			System.out.println(new_str);
		}
	}

}
