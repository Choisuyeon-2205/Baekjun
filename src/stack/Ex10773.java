package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(bf.readLine());
		
		Stack<Integer> st= new Stack<>();
	
		for(int i=0;i<n;i++) {
			int num= Integer.parseInt(bf.readLine());
			if(num==0) {
				st.pop();
			}else {
				st.push(num);
			}
		}
		
		int sum=0;
		for(int a: st)
			sum+=a;
		
		System.out.println(sum);
	}

}
