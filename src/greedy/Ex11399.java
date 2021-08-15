package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11399 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] time= new int[n];
		
		for(int i=0;i<n;i++) {
			time[i]= sc.nextInt();
		}
		
		Arrays.sort(time);
		
		int all= 0;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<=i;j++) {
				sum+=time[j];
			}
			all+=sum;
		}

		System.out.println(all);
	}

}
