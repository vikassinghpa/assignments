package assignment4;
import java.util.*;
public class kthRoot {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		long t=s.nextLong();
		
		for(long i=1;i<=t;i++) {
			long x1=1;
			long x2=Long.MAX_VALUE;
		long ans=-1;
			long n=s.nextLong();
			long k=s.nextLong();
		while(x1<=x2) {
			long x=x1+(x2-x1)/2;
			
			if((long)Math.pow(x, k)==n) {
				ans=x;
				break;
			}
			else if((long)Math.pow(x, k)<n) {
				x1=x+1;
			}
			else if((long)Math.pow(x, k)>n) {
				x2 =x-1;
			}
			ans=x;
		}
		System.out.println(ans);
		}
		

	}

}
