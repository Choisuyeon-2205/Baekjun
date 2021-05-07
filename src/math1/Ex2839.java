package math1;

import java.util.Scanner;

public class Ex2839 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int no3= 0; //3kg 갯수
		
		while(true) {
			if(n%5==0) { //5의 배수이면
				System.out.println(n/5+no3); //5kg수+3kg수 출력
				break;
			}
			else if(n<0) { //5, 3의 합으로 kg수를 배달할 수 없음
				System.out.println(-1);
				break;
			}
			n= n-3; //전체 kg수에서 3kg를 채움 
			no3++; //3kg 수 ++
		}

	}

}
