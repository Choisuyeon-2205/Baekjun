package arrange;

import java.util.Scanner;

public class Ex2577 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr= new int[10];

		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int num= 0;

		a= a*b*c;

		while(a>10) {
			num= a%10;
			arr[num]++;
			a/=10;
		}
		
		arr[a]++;
		
		for(int i: arr)
			System.out.println(i);


	}

}

