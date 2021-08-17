package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13305 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		
		long[] distance= new long[n-1]; //2 3 1
		long[] price= new long[n]; //5 2 4 //1
		
		String[] tmp = br.readLine().split(" ");
		for(int i=0;i<n-1;i++)
			distance[i]= Long.parseLong(tmp[i]);
		
		tmp = br.readLine().split(" ");
		for(int i=0;i<n;i++)
			price[i]= Long.parseLong(tmp[i]);
		
		long sum_dist= 0, min_price= Long.MAX_VALUE;
		long total=0;
		boolean onoff= false;
		
		for(int i=0;i<n-1;i++) {
			if(i==n-2) {
				sum_dist+=distance[i];
			}else if(onoff==false&&price[i]>price[i+1]) {
				sum_dist= distance[i];
				min_price= price[i];
			}else {
				onoff= true;
				sum_dist+= distance[i];
				if(min_price==Long.MAX_VALUE||min_price>price[i]) min_price= price[i];
				continue;
			}
			total+= sum_dist*min_price;	
			sum_dist=0;
			min_price=Long.MAX_VALUE;
			onoff=false;
		}
		System.out.println(total);
	}

}
