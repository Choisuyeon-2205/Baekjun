package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex18258 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		int n= Integer.parseInt(bf.readLine());
		Queue<Integer> queue= new LinkedList<Integer>();
		int last=0;
		StringBuilder sb= new StringBuilder();
		
		for(int i=0; i<n; i++) { //처리할 명령 수
			String s = bf.readLine(); 
			if(s.equals("pop")) {
				sb.append(!queue.isEmpty()?queue.poll()+"\n":-1+"\n");
			}else if(s.equals("front")) {
				sb.append(!queue.isEmpty()?queue.peek()+"\n":-1+"\n");
			}else if(s.equals("back")) {
				sb.append(!queue.isEmpty()?last+"\n":-1+"\n");
			}else if(s.equals("size")) {
				sb.append(queue.size()+"\n");
			}else if(s.equals("empty")) {
				sb.append(queue.isEmpty()?1+"\n":0+"\n");
			}else {
				StringTokenizer st = new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열 넣음
			    st.nextToken();
			    int num= Integer.parseInt(st.nextToken());
			    queue.offer(num);
			    last= num;
			}
		}
		System.out.print(sb);
	}
}