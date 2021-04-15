package string;

import java.util.Scanner;

public class Ex1316 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int case_= sc.nextInt();
		String str= "";
		int count=0; //그룹단어가 아니면 ++

		for(int i=0; i<case_; i++) {
			str=sc.next();
			int[] nums= new int[str.length()];
			new_: for(int j=0; j<str.length(); j++) { //단어하나
				if(j==0||str.charAt(j-1)==str.charAt(j)) {
					nums[j]= str.charAt(j);
					continue;
				}
				for(int k=0; k<nums.length; k++) { //있던건지 체크
					if(nums[k]==str.charAt(j)) {
						count++;
						break new_;
					}
				}
				nums[j]= str.charAt(j);
			}
		}
	System.out.println(case_-count);
	
	}

}

