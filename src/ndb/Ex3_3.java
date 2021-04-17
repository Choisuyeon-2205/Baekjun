package ndb;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 21-04-17
 * 15분 소요
 */

public class Ex3_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int row= sc.nextInt();
		int col= sc.nextInt();

		//카드 입력받기
		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		//행 별로 정렬
		for (int i = 0; i < row; i++) {
			Arrays.sort(arr[i]); //오름차순 정렬
		}
		
		//행들의 가장 작은 수 중 가장 큰 수 찾기
		int max= arr[0][0];
		for (int i = 0; i < row; i++) {
			if(max<arr[i][0])
				max=arr[i][0];
		}
		System.out.println(max);
	}

}
