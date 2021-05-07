package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4948 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0, cnt=0;
		
		while( (n=Integer.parseInt(br.readLine())) != 0 ) {
			cnt= 0;
			for(int i=n+1; i<2*n+1;i++) {
				cnt+=isSosu(i);
			}
			System.out.println(cnt);
		}
	}

	private static int isSosu(int i) {
		int result= 1;
		if(i==1) return 0;
		if(i==2) return 1;
		for(int j=2; j<=Math.sqrt(i); j++) {
			if(i%j==0) {
				result= 0;
				break;
			}
		}
		
		return result;
	}

}
