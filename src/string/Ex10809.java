package string;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10809 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		int[] alphabet= new int[26];
		int su= 0;
		
		Arrays.fill(alphabet, -1);
		
		for(int i=0;i<str.length();i++) {
			su= (int)str.charAt(i)-97;
			if(alphabet[su]==-1) alphabet[su]=i;
		}
	
		for(int i: alphabet) {
			System.out.print(i+" ");
		}

	}

}
