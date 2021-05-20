package recursion;

import java.util.Scanner;

public class Ex2447 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		char[][] star_arr= new char[n][n];
		makeStar(n,star_arr);
		printStar(star_arr);
	}

	

	private static void printStar(char[][] star_arr) {
		for(int i=0;i<star_arr.length;i++) {
			for(int j=0;j<star_arr[0].length;j++) {
				System.out.print(star_arr[i][j]);
			}
			System.out.println();
		}
		
	}

	private static void makeStar(int n, char[][] arr) {
		while(true) {
			int split= n/3; //3 1
			int count=0;
			for(int j=0; j<n; j+=split) { //0 3 9
				for(int i=0; i<n; i+=split) { //0 3 9
					if(count==4) 
						printoff(i,i+split,j,j+split,arr);
					else 
						printon(i,i+split,j,j+split,arr);
					
					count++;
					System.out.println(count);
				}
			}
			if(split==1) break;
			n/=3;
		}

		
	}

	private static void printon(int a, int b, int x,int y, char[][] arr) {
		for(int i=x;i<y;i++) {
			for(int j=a;j<b;j++) {
				arr[i][j]='*';
			}
		}
		
	}

	private static void printoff(int a, int b,int x,int y, char[][] arr) {
		for(int i=x;i<y;i++) {
			for(int j=a;j<b;j++) {
				arr[i][j]=' ';
			}
		}
	}
}
