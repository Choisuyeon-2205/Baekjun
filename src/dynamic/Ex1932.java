package dynamic;

import java.util.Scanner;

public class Ex1932 {
	
	static Integer[][] sum;
	static int[][] num;
	static int n;
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		sum= new Integer[n][n];
		num= new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				num[i][j]= sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			sum[n-1][i]= num[n-1][i];
		}

		System.out.println(max_sum(0,0));
	}

        static int max_sum(int depth, int index) {
			if(depth==n-1) return sum[depth][index];
			
			if(sum[depth][index]==null) {
				sum[depth][index]= Math.max(max_sum(depth+1, index), max_sum(depth+1, index+1))+ num[depth][index];
			}
			
        	return sum[depth][index];
		
	}

}
