package string;

import java.util.Scanner;

public class Ex1157 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		int[] alphabet= new int[26];
		int su= 0, i=0;

		for(i=0;i<str.length();i++) {
			su= str.charAt(i);
			if((su>='A')&&(su<='Z'))
				alphabet[su-65]++;
			else if((su>='a')&&(su<='z'))
				alphabet[su-97]++;
		}
		
		int no= 0, max=0, idx= 0;
		for(i=0; i<alphabet.length; i++) {
			if(alphabet[i]==max) no++;
			if(max<alphabet[i]) {
				max=alphabet[i];
				idx=i;
				no=0;
			}
		}
		
		if(no>0) 
			System.out.println("?");
		else
			System.out.println((char)(idx+65));
		
	}

}
