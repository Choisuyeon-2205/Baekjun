package number;

import java.io.*;
import java.util.*;
public class Ex1037 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		
		int n= Integer.parseInt(br.readLine());
		int[] factors= new int[n];
		
		String s= br.readLine();
		StringTokenizer st= new StringTokenizer(s);
		for(int i=0;i<n;i++) {
			factors[i]= Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(factors);
		System.out.println(factors[0]*factors[n-1]);
	}

}
