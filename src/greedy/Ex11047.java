package greedy;

import java.util.Scanner;

public class Ex11047 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int k= sc.nextInt();
		
		int[] coins= new int[n];
		int count= 0;
		for(int i=0;i<n;i++)
			coins[i]=sc.nextInt();
		
		for(int j=n-1;j>=0;j--) {
			if(k/coins[j]>0) {
				count+=k/coins[j];
				k%=coins[j];
			}
		}

		System.out.println(count);
	}

}
