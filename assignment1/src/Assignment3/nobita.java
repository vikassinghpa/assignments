package Assignment3;
import java.util.*;
public class nobita {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		long testcase =s.nextLong();
		for(int i=1;i<=testcase;i++) {
		long candi=s.nextLong();
		long frnd =s.nextLong();
		if(candi%frnd==0) {
			System.out.println(0);
		}
		else if(candi%frnd>0) {
			long rem1=candi%frnd;
			long rem2=frnd-rem1;
			System.out.println(Math.min(rem1, rem2));
		}
		}

	}

}
