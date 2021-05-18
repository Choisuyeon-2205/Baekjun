package brudeforce;

import java.util.Scanner;
/*
 * 21-05-16
 * 정확히 모든 정보가 만족한 게 아니면 맘대로 break걸지 않기(첫번째 틀린이유)
 * min값 마음대로 주면 안됌(두번째)
 */

public class Ex2798 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		int[] arr = new int[n];
		int i=0; 
		for(i=0; i<n; i++)
			arr[i]=sc.nextInt();
		
		int sum=0, min=0, min_sum=0, first=0;
		
		for(i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length; j++) {
				for(int k=j+1;k<arr.length; k++) {
					sum= arr[i]+arr[j]+arr[k];
		
					if((m-sum<min&&m-sum>=0)||(m-sum>=0&&first==0)) {
						first=1;
						min= m-sum;
						min_sum= sum;
					}
				}
			}
		}
		System.out.println(min_sum);
		
	}
}
