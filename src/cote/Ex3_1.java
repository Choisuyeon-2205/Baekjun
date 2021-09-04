package cote;

import java.util.Arrays;

public class Ex3_1 {

	public static void main(String[] args) {
		long answer= 0;
		long[][] arr= new long[2][4];
		for(long[] i:arr) Arrays.fill(i,1);
		
		for(int i=1;i<2;i++) {
			for(int j=1;j<4;j++) {
				arr[i][j]= arr[i-1][j]+arr[i][j-1];
			}
		}
		
        answer= arr[1][3];
        System.out.println(answer);
	}

}
