package arrange;

import java.util.*;

public class Ex3052 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] su= new int[10];
		HashSet<Integer> na= new HashSet<>();
	
		for(int i=0; i<su.length; i++) {
			su[i]= sc.nextInt();
			na.add(su[i]%42);
		}
		System.out.println(na.size());
	}
}

