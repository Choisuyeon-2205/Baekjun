package math1;

import java.util.Scanner;

public class Ex10250 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int case_no= sc.nextInt();
		
		for(int i=0; i<case_no; i++) {
			int h= sc.nextInt();
			int w= sc.nextInt();
			int order= sc.nextInt();
			
			System.out.printf("%d%02d\n",order%h==0?h:order%h,order%h==0?order/h:order/h+1);

			
		}
		
	}

}
