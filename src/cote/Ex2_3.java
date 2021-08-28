package cote;

import java.util.Arrays;

public class Ex2_3 {

	public static void main(String[] args) {
		Solution sol= new Solution();
		int[] arr= {1,1};
		System.out.println(sol.solution(3,arr));

	}

}


class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        for(int i=0;i<n;i++){
            Arrays.sort(works);
            if(works[works.length-1]<1) return 0;
            works[works.length-1]--;
        }
        
        for(int num:works){
            answer+=Math.pow(num,2);
        }
        
        return answer;
    }
}