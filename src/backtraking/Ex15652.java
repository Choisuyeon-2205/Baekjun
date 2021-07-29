package backtraking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex15652 {
 
	public static int[] arr;
	public static int N,M;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		String s = bf.readLine(); //String
		StringTokenizer st = new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열 넣음
		N = Integer.parseInt(st.nextToken()); //첫번째 호출
		M = Integer.parseInt(st.nextToken()); //두번째 호출
		
		arr = new int[M];
		
		dfs(0);		
		System.out.println(sb);
	}
 
	public static void dfs(int depth) {
		if (depth == M) {
			for (int i=0;i<M;i++){
				if(i<M-1&&arr[i]>arr[i+1])
					return;
			}
			for (int i=0;i<M;i++){
				sb.append(arr[i]+" ");
			}
			sb.append('\n');
			return;
			}
 
		for (int i = 1; i <= N; i++) {
				arr[depth] = i;
				dfs(depth + 1);
		}
	}
 
}