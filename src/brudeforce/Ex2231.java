package brudeforce;
/*
 * 21-05-18
 * 1번만에 성공!
 * 코드도 나쁘지 않은 것 같다.
 */
import java.util.Scanner;

public class Ex2231 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int chk=0;
		
		for(int i=10; i<=n; i++) {
			int num= i; //생성자를 위해 연산작업할때 사용
			int num2= i; //생성한 수

			while(num>=10) {
				num2+= num%10;
				num/=10;
			}
			num2+=num;
			if(num2==n){
				System.out.println(i);
				chk=1;
				break;
			}
		}
		if(chk==0) System.out.println(0);
	}

}
