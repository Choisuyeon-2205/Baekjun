package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex4949 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		String s="";
		while(!(s=bf.readLine()).equals(".")) { //.을 만날 때 까지 실행, 문자열 한 줄 입력받음
			boolean isCorrect= true; //문장이 참인가?
			Stack<Character> stack= new Stack<>();
			for(int i=0;i<s.length();i++) { //받은 문자열을 한 문자씩 
				char c= s.charAt(i);
				if(c=='('||c=='[') { //해당 문자가 '('나 '['면 
					stack.push(c);   //stack에 push
				}else if(c==')'){    //해당 문자가 ')'이면
					if(!stack.isEmpty()&&stack.peek()=='(')  //스택이 비어있지 않고, stack의 top자리가 '('이면
						stack.pop();  //pop
					else {
						isCorrect=false; //스택이 비어있거나(여는 괄호 없이 닫는 괄호가 옴), stack의 top의 괄호가 다른 괄호일 때 => 문장이 false
						break; //이미 문장이 안맞으니, break
					}
				}else if(c==']'){    //해당 문자가 ']'이면
					if(!stack.isEmpty()&&stack.peek()=='[')   //스택이 비어있지 않고, stack의 top자리가 '['이면
						stack.pop();  //pop
					else {
						isCorrect=false;  //스택이 비어있거나(여는 괄호 없이 닫는 괄호가 옴), stack의 top의 괄호가 다른 괄호일 때 => 문장이 false
						break;  //이미 문장이 안맞으니, break
					}
				}
			}
			if(!stack.isEmpty()) isCorrect=false;  //끝까지 읽었는데, stack이 차있음 => 여는 괄호가 더 많음 => 문장이 false
			System.out.println(isCorrect?"yes":"no");
		}
	}

}
