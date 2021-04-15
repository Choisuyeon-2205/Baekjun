package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//문제 자체는 쉬웠는데, 시간초과로 무조건 bufferedreader사용헤야한다.
//반복문 돌면 시간초과.... 반복문 사용안하는 아이디어 찾기
public class Ex2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int up= Integer.parseInt(st.nextToken());
		int down= Integer.parseInt(st.nextToken());
		int top= Integer.parseInt(st.nextToken());
		int current= 0, day=0;
		
		while(true) {
			day++;
			current+= up;
			
			if(current>=top)
				break;
			
			current-= down;
				
		}
		System.out.println(day);
	}
}
