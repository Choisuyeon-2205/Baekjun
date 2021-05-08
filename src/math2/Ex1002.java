package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1002 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s= br.readLine();
		int c= Integer.parseInt(s);
		int arr[]= new int[6];
		for(int i=0; i<c; i++) {
			s= br.readLine();
			StringTokenizer st= new StringTokenizer(s);
			for(int j=0; j<arr.length; j++) {
				arr[j]= Integer.parseInt(st.nextToken());
			}
			if(arr[0]==arr[3]&&arr[1]==arr[4]) {
				if(arr[2]==arr[5]) 
					System.out.println(-1);
				else
					System.out.println(0);
			}else {
				int distance= (int)(Math.pow(arr[0]-arr[3],2)+ Math.pow(arr[1]-arr[4],2));
				if(distance == Math.pow(arr[2]+arr[5],2)) //외접
					System.out.println(1);
				else if(distance> Math.pow(arr[2]+arr[5],2))
					System.out.println(0); //원이 접하지 않을 때
				else if(distance< Math.pow(arr[2]-arr[5],2))
					System.out.println(0); //하나의 원안에 다른 원(내접x)
				else if(distance==Math.pow(arr[2]-arr[5],2))
					System.out.println(1); //내접
				else
					System.out.println(2);
			}
		}
		
	}

}
