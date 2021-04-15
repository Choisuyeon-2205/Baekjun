package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2869_new {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int up= Integer.parseInt(st.nextToken());
		int down= Integer.parseInt(st.nextToken());
		int top= Integer.parseInt(st.nextToken());
		
		int day= (top-down)/(up-down);
		if((top-down)%(up-down)!= 0)
			day++;
		
		System.out.println(day);
	}
}
