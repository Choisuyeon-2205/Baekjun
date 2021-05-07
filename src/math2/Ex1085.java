package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex1085 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s= br.readLine();
		StringTokenizer st = new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열 넣음
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken()); 
		
		int arr[]= new int[4];
		arr[0]= x;
		arr[1]= w-x;
		arr[2]= y;
		arr[3]= h-y;
		Arrays.sort(arr);
		System.out.println(arr[0]);

	}

}
