package arrange;

import java.util.Scanner;

public class Ex4344 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int no= sc.nextInt();
	
		for(int j=0; j<no; j++) {
			int num= sc.nextInt();
			int[] scores= new int[num];
			for(int i=0;i<num;i++) {
				scores[i]= sc.nextInt();
			}
			int total= 0;
			double avg= 0;

			for(int score: scores) {
				total+= score;
			}
			avg= (double)total/num;

			double count = 0;
			for(int score: scores) {
				if(score>avg) count++;
			}
			
			System.out.printf("%.3f%%\n",(count/num)*100);
		}
	
	}

}