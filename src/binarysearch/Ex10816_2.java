package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Ex10816_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		
		int n= Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> set= new HashMap<Integer, Integer>();
		String s= br.readLine();
		StringTokenizer st= new StringTokenizer(s);
		for(int i=0;i<n;i++) {
			int num= Integer.parseInt(st.nextToken());
			
			if(set.containsKey(num)) {
				set.put(num, set.get(num)+1);
			}else {
				set.put(num, 1);
			}
		}
		
		int m= Integer.parseInt(br.readLine());
		s= br.readLine();
		st= new StringTokenizer(s);
		
		boolean isFirst= true;
		while(st.hasMoreTokens()) {
			int num= Integer.parseInt(st.nextToken());
			int result= 0;
			
			if(set.containsKey(num)) {
				result= set.get(num);
			}
			
			sb.append(isFirst?result:" "+result);
			isFirst=false;
		}

		System.out.println(sb);
	}

}
