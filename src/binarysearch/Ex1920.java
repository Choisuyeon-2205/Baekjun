package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex1920 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		//주어진 배열 입력받기
		int n= Integer.parseInt(br.readLine());
		int[] A= new int[n];
		String s= br.readLine();
		StringTokenizer st= new StringTokenizer(s);
		String num="";
		int i=0;
		while(st.hasMoreTokens()) {
			num=st.nextToken();
			A[i]= Integer.parseInt(num);
			i++;
		}
		Arrays.sort(A);
		
		//판단해야할 수들 입력받기
		int m= Integer.parseInt(br.readLine());
		int[] nums= new int[m];
		s= br.readLine();
		st= new StringTokenizer(s);
		i=0;
		while(st.hasMoreTokens()) {
			num=st.nextToken();
			nums[i]= Integer.parseInt(num);
			i++;
		}
		
		//있는지 판단하는 알고리즘
		boolean first= true;
		for(int su: nums) {
			if(!first) sb.append("\n");
			sb.append(Arrays.binarySearch(A, su)>=0?1:0);
			first= false;
		}
		
		System.out.println(sb);
	}

}
