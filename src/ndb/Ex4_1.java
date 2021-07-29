package ndb;

/*
 * 21-06-01
 * 상하좌우: nxn 공간이 주어지면, L,R,U,D 문자를 입력받아 움직인 결과 좌표를 출력
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex4_1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= Integer.parseInt(sc.nextLine());
		List<Integer> move= new ArrayList<Integer>();
		//sc.next();
		String s= sc.nextLine();
		System.out.println(s);
		StringTokenizer st= new StringTokenizer(s," ");
		while(st.hasMoreTokens()) {
			move.add((int)st.nextToken().charAt(0));
		}
		
		int x=1, y=1;
		
		for(int mv: move) {
			System.out.println((char)mv);
			switch((char)mv) {
			case 'L':
				if(y>=2) y-=1;
				break;
			case 'R':
				if(y<n) y+=1;
				break;
			case 'U':
				if(x>=2) x-=1;
				break;
			case 'D':
				if(x<n) x+=1;
				break;
			}
		}
		
		System.out.println(x+" "+y);
	}
}
