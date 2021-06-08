package brudeforce;
/*
 * 21-05-19
 * 1. 그냥 뒤에 666만 붙이면 되는줄 알앗음=> 틀림
 * 2. 끝까지 돌아서 중간에 세글자가 666이어도 계속 진행해서 없이질수도잇음
 */

import java.util.Scanner;

public class Ex1436 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int count= 0;
		
		int i=666;
		while(true) {
			int j=i;
			int chk=0;
			
			while(j>10) {
				if(j%10==6) {
					chk++;
				}else {
					chk=0;
				}
				
				if(chk>=3) {
					break;
				}
				j/=10;
			}	
			
			if(j==6) chk++;
			if(chk>=3) count++;
			if(count==n) break;
			i++;
		}
		System.out.println(i);
	}

}
