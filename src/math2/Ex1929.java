package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//소수구하기
public class Ex1929 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s= br.readLine();
		StringTokenizer st = new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열 넣음
		int start = Integer.parseInt(st.nextToken()); //첫번째 호출
		int end = Integer.parseInt(st.nextToken()); //두번째 호출
		
		for(int i=start; i<end+1; i++) {
			int isNotSo=0;
			if(i==1) { 
				continue;
			}else {
				for(int j=2; j<=Math.sqrt(i); j++) {
					if(i%j==0) {
						isNotSo=1;
						break;
					}
				}
			}
			if(isNotSo==0) System.out.println(i);
		}
	}

}
