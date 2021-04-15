package math1;

import java.util.Scanner;

public class Ex2775 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int case_no= sc.nextInt();
		
		for(int i=0; i<case_no; i++) {
			int k= sc.nextInt(); //층
			int n= sc.nextInt(); //호수
		
			System.out.println(countPeople(k,n));
		}

	}

	private static int countPeople(int k, int n) {
		int total=0;
		
		if(k==0) {
			total= n;
		}else {
			for(int i=1; i<=n; i++) {
				total+=countPeople(k-1, i);
			}
		}
	
		return total;
	}

}
