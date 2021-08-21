package cote;

public class Ex2 {
	public static void main(String[] args) {
		int[] count= new int[26];
		String s= "aabbbccd";
		
		for(int i=0;i<s.length();i++) {
			int c= s.charAt(i);
			count[c-97]++;
		}
		
		for(int c: count)
			System.out.println(c);
	}
}
