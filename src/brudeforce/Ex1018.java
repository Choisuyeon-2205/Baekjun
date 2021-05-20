package brudeforce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
 * 21-05-19
 * - 맨 왼쪽 첫 번째 것이 b/w 일때 두번 해야하는데 처음 기준으로 해서 한번 틀림
 * - 더 나은코드? 
 */

public class Ex1018 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		char[][] base= new char[n][m];
		char[][] base_cp= new char[n][m];
		List<Integer> counts= new ArrayList<Integer>();
		
		
		for(int i=0;i<n;i++) {
			String s= sc.next();
			for(int j=0;j<m;j++) {
				base[i][j]= s.charAt(j);
			}
		}
		
		for(int a=0;a<=n-8;a++) {  //0 1 2
			for(int b=0;b<=m-8;b++) { //0 1 2 3 4 5
				
				for(int i=0; i<base.length; i++) {
		            for(int j=0; j<base[i].length; j++) {
		            	base_cp[i][j] = base[i][j];  
		            }
		        }
				int count=0;
				if(base_cp[a][b]=='W') {
					base_cp[a][b]='B';
					count++;
				}
				
				for(int i=a; i<a+8; i++) {
					for(int j=b; j<b+8; j++) {
						if(i==a&&j!=b) {
							if(base_cp[i][j]==base_cp[i][j-1]) {
								count++;
								base_cp[i][j]=(base_cp[i][j]=='W')?'B':'W';
							}
						}else if(i!=a&&j!=b) {
							if(base_cp[i][j]==base_cp[i][j-1]||base_cp[i][j]==base_cp[i-1][j]) {
								count++;
								base_cp[i][j]=(base_cp[i][j]=='W')?'B':'W';
							}
						}else if(i!=a&&j==b) {
							if(base_cp[i][j]==base_cp[i-1][j]) {
								count++;
								base_cp[i][j]=(base_cp[i][j]=='W')?'B':'W';
							}
						}	
					}
				}
				//System.out.println(count);
				counts.add(count);
			
				for(int i=0; i<base.length; i++) {
		            for(int j=0; j<base[i].length; j++) {
		            	base_cp[i][j] = base[i][j];  
		            }
		        }
				count=0;
				if(base_cp[a][b]=='B') {
					base_cp[a][b]='W';
					count++;
				}
				
				for(int i=a; i<a+8; i++) {
					for(int j=b; j<b+8; j++) {
						if(i==a&&j!=b) {
							if(base_cp[i][j]==base_cp[i][j-1]) {
								count++;
								base_cp[i][j]=(base_cp[i][j]=='W')?'B':'W';
							}
						}else if(i!=a&&j!=b) {
							if(base_cp[i][j]==base_cp[i][j-1]||base_cp[i][j]==base_cp[i-1][j]) {
								count++;
								base_cp[i][j]=(base_cp[i][j]=='W')?'B':'W';
							}
						}else if(i!=a&&j==b) {
							if(base_cp[i][j]==base_cp[i-1][j]) {
								count++;
								base_cp[i][j]=(base_cp[i][j]=='W')?'B':'W';
							}
						}	
					}
				}
				//System.out.println(count);
				counts.add(count);
			}
		}
		
		System.out.println(Collections.min(counts));
		
	}
}
