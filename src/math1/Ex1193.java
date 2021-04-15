package math1;

import java.util.Scanner;

public class Ex1193 {
	//21-04-14
	//안좋은 코드같은 느낌이 든다.

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int count= 0;

		int i=1;
		loop: while(true) {
			if(i%2==0) {
				int k=i;
				for(int j=1; j<=i;j++) {
					if(count==num)
						break loop;
					if(count==num-1)
						System.out.println(j+"/"+k);
					count++;
					k--;
				}	
			}else {
				int k=1;
				for(int j=i; j>=1;j--) {
					if(count==num)
						break loop;
					if(count==num-1)
						System.out.println(j+"/"+k);
					count++;
					k++;
				}
			}
			i++;
		}
		
	}

}
