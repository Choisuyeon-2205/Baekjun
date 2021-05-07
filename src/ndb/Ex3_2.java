package ndb;

import java.util.Scanner;

/*
 * 21-04-17
 * 20분 소요
 */

public class Ex3_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int no= sc.nextInt();
		int m= sc.nextInt();
		int k= sc.nextInt();
		int[] nums = new int[no];
		
		//배열 입력
		for(int i=0; i<no; i++) {
			nums[i]= sc.nextInt();
		}
		
		//정렬
		for(int i=0; i<no; i++) {
			for(int j=i+1; j<no; j++) {
				if(nums[i]<nums[j]) {
					int tmp = 0;
					tmp= nums[i];
					nums[i]=nums[j];
					nums[j]=tmp;
				}
			}
		}
		
		//result 구하기
		int cnt=0;
		int result=0;
		for(int i=0; i<m; i++) {
			if(cnt>=k) {
				cnt=0;
				result+=nums[1];
				continue;
			}
			result+=nums[0];
			cnt++;
		}
		System.out.println(result);
	}

}
