package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex4153 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s= "";
		while ((s= br.readLine())!=null) {
			int len[]= new int[3];
			StringTokenizer st= new StringTokenizer(s);
			len[0]= Integer.parseInt(st.nextToken());
			len[1]= Integer.parseInt(st.nextToken());
			len[2]= Integer.parseInt(st.nextToken());
			if(len[0]==0&&len[1]==0&&len[2]==0) break;
			
			Arrays.sort(len);
			if(Math.pow(len[0], 2)+ Math.pow(len[1], 2)==Math.pow(len[2], 2))
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}

}
