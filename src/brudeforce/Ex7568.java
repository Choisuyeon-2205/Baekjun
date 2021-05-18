package brudeforce;

import java.util.Scanner;
/*
 * 21-05-18
 * 못해서 질문 참고함
 * 자바 rank 지원안해서 당황함
 * rank 하나씩 할필요 없이 따로따로 비교해주면 해결되는 문제였다.
 */
public class Ex7568 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int spec[][] = new int[n][2];
		int rank[] = new int[n];

		for(int i=0; i<n; i++) {
			spec[i][0] = sc.nextInt();
			spec[i][1] = sc.nextInt();
			rank[i]=1;
		}
		
		for(int i=0;i<n;i++)
			for(int j = 0;j<n;j++)
				if(spec[i][0]>spec[j][0]&&spec[i][1]>spec[j][1])
					rank[j]++;
		
		for(int i=0;i<n;i++)
			System.out.println(rank[i]);
	}

}
