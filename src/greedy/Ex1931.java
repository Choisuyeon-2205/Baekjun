package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex1931 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int[][] timetable = new int[n][2];
		for(int i = 0; i < n; i++) {
			timetable[i][0] = sc.nextInt();	// 시작시간 
			timetable[i][1] = sc.nextInt();	// 종료시간 
		}
		
		
		// 끝나는 시간을 기준으로 정렬하기 위해 compare 재정의 
		Arrays.sort(timetable, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.  
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}	
				return o1[1] - o2[1];
			}
 
		});
		
		int count = 0;
		int start = 0;
		
		for(int i = 0; i < n; i++) {
			
			// 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신 
			if(start <= timetable[i][0]) {
				start = timetable[i][1];
				count++;
			}
		}
		
		System.out.println(count);
	}

}
