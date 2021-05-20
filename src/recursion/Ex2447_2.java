package recursion;

import java.util.Scanner;
/*
 * 21-05-20
 * 이 주 동안 못풀어서 다른사람 코드 참고함
 * 리뷰 제대로 하기!!!
 */

public class Ex2447_2 {

	static char[][] arr;
	 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
 
		arr = new char[n][n];
        
		star(0, 0, n, false);
		
		print_star(n);
	}
 
	private static void print_star(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
		
	}

	static void star(int x, int y, int n, boolean blank) {
 
		// 공백칸일 경우
		if (blank) {
			for (int i = x; i < x + n; i++) {
				for (int j = y; j < y + n; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
 
		// 더이상 쪼갤 수 없는 블록일 때
		if (n == 1) {
			arr[x][y] = '*';
			return;
		}
 
		/*
		   N=27 일 경우 한 블록의 사이즈는 9이고, 
		   N=9 일 경우 한 블록의 사이즈는 3이듯
		   해당 블록의 한 칸을 담을 변수를 의미 size
           
		   count는 별 출력 누적을 의미
		 */
 
		int size = n / 3;  //9
		int count = 0;
		for (int i = x; i < x + n; i += size) { //0 9 18 27
			for (int j = y; j < y + n; j += size) {  //0 9 18 27
				count++;
				if (count == 5) { // 공백 칸일 경우
					star(i, j, size, true); //star(9,9,9,true)
				} else {
					star(i, j, size, false); //star(0,0,9,false)
				}
			}
		}
	}
}

