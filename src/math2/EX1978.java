package math2;

import java.util.Scanner;

public class EX1978 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int testcase= sc.nextInt();
		int count=0; //소수가 아닌 숫자의 갯수
		
		for(int i=0; i<testcase; i++) {
			int num=sc.nextInt();
			if(num==1) count++;
			else if(num==2) continue;
			else {
				int on=0;
				for(int j=2; j<num; j++) {
					if(num%j==0) {
						on++;
						break;
					}
				}
				if(on>0) count++;
			}
		}
		System.out.println(testcase-count);
	}

}
