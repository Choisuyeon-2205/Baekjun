package dynamic;

import java.util.Scanner;

public class Ex1904 {

	static Long[] arr;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		arr= new Long[n+1];
	
		System.out.println(count_tile(n));
	}
	
	private static long count_tile(int n) {
		if(n==0) return 0;
		else if(n==1) return 1;
		else if(n==2) return 2;
		else if(arr[n]==null){
			arr[n]=(count_tile(n-1)+count_tile(n-2))%15746;
		}

		return arr[n];
	}

}
