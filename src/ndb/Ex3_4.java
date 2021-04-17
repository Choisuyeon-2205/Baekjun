package ndb;

import java.io.*;
import java.util.*;

public class Ex3_4 {

/*
 * 21-04-17
 * 6분 소요
 */

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int n= Integer.parseInt(st.nextToken());
		int k= Integer.parseInt(st.nextToken());
		int cnt=0;

		while(n!=1) {
			if(n%k==0) {
				n/=k;
			}else {
				n--;
			}
			cnt++;
		}
		System.out.println(cnt);
	}

}
