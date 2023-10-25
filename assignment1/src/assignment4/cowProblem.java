package assignment4;
import java.util.*;
public class cowProblem {
public static boolean canIPlace(long arr[],long mid,long cows) {
	int count=1;
	long i=arr[0];
	for(int j=1;j<arr.length;j++) {
		if(arr[j]-i>=mid) {
			count++;
			i=arr[j];
		}
	}
	if(count>=cows) {
		return true;
		
	}
	else {
		return false;
	}
}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
      int stall=s.nextInt();
      long cows =s.nextInt();
      long arr[]=new long[stall];
      for(int i=0;i<stall;i++) {
    	  arr[i]=s.nextInt();
      }
      Arrays.sort(arr);
      long start=1;
      long end =arr[stall-1]-arr[0];
      long ans=-1;
      while(start<=end) {
    	  long mid =start+(end-start)/2;
    	  if(canIPlace(arr,mid,cows)==true) {
    		  
    		  start=mid+1;
    		  ans=mid;
    	  }
    	  else {
    		  end=mid-1; 
    	  }
    	 
      }
      System.out.println(ans);
	}

}
