package assignment4;
import java.util.*;
public class squareRoot {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		long n=s.nextInt();
		long start =0;
		long end= Long.MAX_VALUE;
		long ans=-1;
		while(start<=end) {
			long mid =start +(end-start)/2;
			 if((int)Math.pow(mid, 2)==n) {
				 ans=mid;
				 break;
			 }
			 else if((int)Math.pow(mid, 2)>n) {
				 end=mid-1;
			 }
			 else if((int)Math.pow(mid, 2)<n) {
				 start=mid+1;
			 }
			 ans=mid;
		}
		System.out.println(ans);
    System.out.println((long)Math.pow(26, 0.5));
	}

}