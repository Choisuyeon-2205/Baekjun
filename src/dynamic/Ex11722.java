package dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11722 {
	public static int[] arr;
	public static Integer[] dp;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		arr= new int[n];
		dp= new Integer[n];
		
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
				find_lds(i);
		
		Arrays.sort(dp);		
		System.out.println(dp[dp.length-1]);
	}
	private static int find_lds(int n) {
		// 만약 탐색하지 않던 위치의 경우 
		if(dp[n] == null) {
			dp[n] = 1;	// 1로 초기화 
					
			// N-1 부터 0까지중 N보다 작은 값들을 찾으면서 재귀호출. 
			for(int i = n - 1; i >= 0; i--) {
				if(arr[i] > arr[n]) {
						dp[n] = Math.max(dp[n], find_lds(i) + 1);
					}
				}
			}
		return dp[n];
	}

}