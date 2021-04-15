package arrange;
import java.util.Scanner;

public class Ex8958 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int[] scoreList= new int[num];

		for(int i=0; i<num; i++) {
			String s= sc.next();
			int[] scores= new int[s.length()];
			int sum= 0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)=='O') {
					if(j==0) 
						scores[j]=1;
					else
						scores[j]+=scores[j-1]+1;
				}
			}
			for(int score:scores)
				scoreList[i]+=score;
		}
		for(int list: scoreList)
			System.out.println(list);
	}
}
