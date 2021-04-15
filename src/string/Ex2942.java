package string;

import java.util.Scanner;

public class Ex2942 {
//mathces() - 정규식을 이용해서 특정 문자를 검색
//어렵다.
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		int count=0;
		
		if(str.contains("dz=")) count+=2;
		if(str.contains("lj")) count++;
		if(str.contains("nj")) count++;
		if(str.contains("z=")) count++;
		if(str.contains("s=")) count++;
		
		System.out.println(str.length()-count);
	}

}
