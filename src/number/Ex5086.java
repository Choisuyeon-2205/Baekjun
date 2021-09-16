package number;

import java.io.*;
import java.util.StringTokenizer;

public class Ex5086 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		String s= "";
		
		while((s=br.readLine())!=null) {
			StringTokenizer st= new StringTokenizer(s);
			int n1= Integer.parseInt(st.nextToken());
			int n2= Integer.parseInt(st.nextToken());
			
			if(n1==0&&n2==0) break;
			else if(n1%n2==0) sb.append("multiple\n");
			else if(n2%n1==0) sb.append("factor\n");
			else sb.append("neither\n");
		}
		
		System.out.println(sb);
	}

}
