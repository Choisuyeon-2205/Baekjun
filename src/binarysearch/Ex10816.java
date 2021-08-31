package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Ex10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		
		int n= Integer.parseInt(br.readLine());
		Integer[] arr= new Integer[n];
		String s= br.readLine();
		StringTokenizer st= new StringTokenizer(s);
		for(int i=0;i<n;i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int m= Integer.parseInt(br.readLine());
		s= br.readLine();
		st= new StringTokenizer(s);
		int[] nums= new int[m];
		for(int i=0;i<m;i++) {
			nums[i]= Integer.parseInt(st.nextToken());
		}
		
		
		List<Integer> arrlist= Arrays.asList(arr);
		boolean isFirst= true;
		for(int num: nums) {
			int result= Arrays.binarySearch(arr, num);
			if(result>=0) {
				result= Collections.frequency(arrlist, num);
			}else {
				result= 0;
			}
			sb.append(isFirst?result:" "+result);
			isFirst=false;
		}

		System.out.println(sb);
	}

}
