package math2;

import java.util.Scanner;

public class EX2581 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int start= sc.nextInt();
		int end= sc.nextInt();
		int sum=0, min=0;
		int on=0;
		
		for(int i=start; i<end+1; i++) {
			int isNotSo=0; //소수가 아니면1, 소수이면 0
			if(i==1) { 
				continue;
			}else {
				for(int j=2; j<i; j++) {
					if(i%j==0) {
						isNotSo=1; //i가 소수가 아니면 1
						break;
					}
				}
				if(isNotSo==0) sum+=i; //소수이면 합산해줌
			}
			if(on==0&&isNotSo==0) { //소수중 첫번째만 min에 저장
				min=i;
				on++;
			}
		}
		System.out.println(on==0?-1:sum+"\n"+min);
	}

}
