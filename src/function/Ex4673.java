package function;

public class Ex4673 {

	public static void main(String[] args) {
		
		int[] nums= new int[10000];
		
		for(int i=0; i<10000; i++) {
			int su= self_num(i+1);
			if(su<10001) nums[su-1]++;
		}
		
		for(int j=0;j<10000;j++) {
			if(nums[j]==0) System.out.println(j+1);
		}

	}

	private static int self_num(int i) {
		int result=i;
	
		while(i!=0) {
			result+=i%10;
			i= i/10;
		}
		
		return result;
	}

}
