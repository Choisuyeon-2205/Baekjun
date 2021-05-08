package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Ex3009 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int x[]= new int[3];
		int y[]= new int[3];
		for(int i=0; i<x.length; i++) {
			String s= br.readLine();
			StringTokenizer st= new StringTokenizer(s);
			x[i]= Integer.parseInt(st.nextToken());
			y[i]= Integer.parseInt(st.nextToken());
		}
		System.out.println(selectXY(x)+" "+selectXY(y));
	}

	private static int selectXY(int[] x) {
		if(x[0]==x[1]) return x[2];
		else if(x[0]==x[2]) return x[1];
		else return x[0];
	}

}
