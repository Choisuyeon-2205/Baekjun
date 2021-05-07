package string;

import java.util.Scanner;

public class Ex2941 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		String re= "";
		int count=0;

		for(int i=0; i<str.length(); i++) {
			char c= str.charAt(i);
			if(re.length()!=0) {
				if(re.equals("c")) {
					if(c=='='||c=='-') { 
						count++;
					}
					re="";
				}else if(re.equals("d")) {
					if(c=='z') {
						re+=c;
					}else if(c=='-') {
						count++;
						re="";
					}else {
						re="";
					}
				}else if(re.equals("l")||re.equals("n")) {
					if(c=='j') {
						count++;
					}
					re="";
				}else if(re.equals("s")||re.equals("z")) {
					if(c=='=') {
						count++;
					}
					re="";
				}else if(re.equals("dz")) {
					if(c=='=') {
						count+=2;
					}
					re="";
				}
			}

			if(c=='c'&&re=="") re+=c;
			else if(c=='l'&&re=="") re+=c;
			else if(c=='d'&&re=="") re+=c;
			else if(c=='n'&&re=="") re+=c;
			else if(c=='s'&&re=="") re+=c;
			else if(c=='z'&&re=="") re+=c;

		}
		System.out.println(str.length()-count);
	}

}
