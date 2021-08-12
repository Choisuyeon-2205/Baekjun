package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Ex10866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		Deque<Integer> deque= new ArrayDeque();
		
		for(int i=0;i<n;i++) {
			String s= br.readLine();
			if(s.equals("front")) {
				System.out.println(deque.isEmpty()?-1:deque.getFirst());
			}else if(s.equals("back")) {
				System.out.println(deque.isEmpty()?-1:deque.getLast());
			}else if(s.equals("empty")) {
				System.out.println(deque.isEmpty()?1:0);
			}else if(s.equals("size")) {
				System.out.println(deque.size());
			}else if(s.equals("pop_front")) {
				System.out.println(deque.isEmpty()?-1:deque.pollFirst());
			}else if(s.equals("pop_back")) {
				System.out.println(deque.isEmpty()?-1:deque.pollLast());
			}else {
				StringTokenizer st= new StringTokenizer(s);
				String order= st.nextToken();
				int num= Integer.parseInt(st.nextToken());
				
				if(order.equals("push_front")) {
					deque.offerFirst(num);
				}else if(order.equals("push_back")) {
					deque.offerLast(num);
				}
			}
		}
	}
}
