package cote;

import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		
		String[] students= {"ALALLAAPAA","ALLLAAAPAA","APAPALLAAA"};
		int[] answer= new int[students.length];
		
		for(int j=0;j<students.length;j++) {
			int score= 10;
			int[] count= new int[3]; //ALP
			for(int i=0;i<students[j].length();i++) {
				char c= students[j].charAt(i);
				if(c=='A') count[0]++;
				else if(c=='L') count[1]++;
				else count[2]++;
			}
			
			count[2]+=count[1]/2;
			
			if(count[2]>=3) {
				score=0;
			} else {
				score+=count[0];
				score-=count[2];
			}
			answer[j]= score;
		}

		rank
		System.out.println(Arrays.toString(answer));
	}

}
