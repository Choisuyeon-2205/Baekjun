package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());

		for(int i=0;i<n;i++) {
			Boolean isEmp = true; //stack이 비어있는지!
			String s= br.readLine();
			Stack<Character> stack= new Stack<>();
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)=='(') {
					stack.push('(');
				}else {
					if(!stack.isEmpty()) { //언더 플로우 방지
						stack.pop(); 
					}else {
						isEmp=false; //빼야하는데 스택에'('가 더이상 없음=> 괄호가 맞지않음
						break;
					}
				}
			}
			if(!stack.isEmpty()) isEmp=false; //문자열을 끝까지 읽었는데도 스택에 '('가 남아있음 => 괄호가 맞지 않음
			System.out.println(isEmp?"YES":"NO");
		}
	}
}
