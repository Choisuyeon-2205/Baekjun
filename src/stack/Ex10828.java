package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		int n= Integer.parseInt(bf.readLine());
		Stack<Integer> stack= new Stack<>();
		
		for(int i=0; i<n; i++) { //처리할 명령 수
			String s = bf.readLine(); 
			if(s.equals("pop")) {
				System.out.println(!stack.empty()?stack.pop():-1);
			}else if(s.equals("top")) {
				System.out.println(!stack.empty()?stack.peek():-1);
			}else if(s.equals("size")) {
				System.out.println(stack.size());
			}else if(s.equals("empty")) {
				System.out.println(stack.empty()?1:0);
			}else {
				StringTokenizer st = new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열 넣음
			    st.nextToken();
				stack.push(Integer.parseInt(st.nextToken()));
			}
		}
	}
}
