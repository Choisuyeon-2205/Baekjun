package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1003 {
	
	public static int count_zero=0;
	public static int count_one=0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		StringBuilder sb= new StringBuilder();
		
		String s[]= new String[41];
		for(int i=0;i<n;i++) {
			int num= Integer.parseInt(br.readLine());
			
			if(s[num]!=null) {
				sb.append(s[num]);
			}else {
				fibonacci(num);
				sb.append(count_zero+" "+count_one+"\n");
				s[num]=count_zero+" "+count_one+"\n";
				count_zero=0;
				count_one=0;
			}
		}
		
		System.out.println(sb);
	}
	
	
	public static int fibonacci(int n) {
	    if (n == 0) {
	        count_zero++;
	        return 0;
	    } else if (n == 1) {
	    	count_one++;
	        return 1;
	    } else {
	        return fibonacci(n-1)+fibonacci(n-2);
	    }
	}

}
