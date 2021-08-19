package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex9184 {
	
	public static Integer[][][] arr= new Integer[21][21][21];

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		
		while(true) {
			String s= br.readLine();		
			StringTokenizer st= new StringTokenizer(s);
			int a= Integer.parseInt(st.nextToken());
			int b= Integer.parseInt(st.nextToken());
			int c= Integer.parseInt(st.nextToken());
	
			if(a==-1&&b==-1&&c==-1) break;
			sb.append("w("+a+", "+b+", "+c+") = "+w(a,b,c)+"\n");
		}
		
		System.out.println(sb);
	}

	private static int w(int a, int b, int c) {
		if(a<=0||b<=0||c<=0) return 1;
		else if(a>20||b>20||c>20) return w(20,20,20);
		
		if(arr[a][b][c]==null) {
			if(a < b&&b < c) {
				arr[a][b][c-1]= w(a,b,c-1);
				arr[a][b-1][c-1]= w(a, b-1, c-1);
				arr[a][b-1][c]= w(a, b-1, c);
				return arr[a][b][c-1] + arr[a][b-1][c-1] - arr[a][b-1][c];
			}
			else {
				arr[a-1][b][c]= w(a-1, b, c);
				arr[a-1][b-1][c]= w(a-1, b-1, c);
				arr[a-1][b][c-1]= w(a-1, b, c-1);
				arr[a-1][b-1][c-1]= w(a-1, b-1, c-1);
				
				return arr[a-1][b][c] +arr[a-1][b-1][c]+arr[a-1][b][c-1] -arr[a-1][b-1][c-1];
			}
		}
		
		return arr[a][b][c];
	}

}
