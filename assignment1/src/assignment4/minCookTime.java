package assignment4;
import java.util.*;
public class minCookTime {
public static boolean possible(int[]arr,int p,int t) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		int sum=0;
		while(sum<=t) {
			sum=sum+arr[i];
			arr[i]=2*arr[i];
			count++;
		}
		count--;
	}
	if(count>=p) {
		return true;
	}
	else
		return false;
}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        int p=s.nextInt();
        int cook=s.nextInt();
        int arr[]= new int[cook];
        for(int i=0;i<cook;i++) {
        	arr[i]=s.nextInt();
        }
        int ti=0;
        int te=Integer.MAX_VALUE;
        int ans=-1;
        while(ti<=te) {
        	int t=ti+(te-ti)/2;
        	if(possible(arr,p,t)==true) {
        		te=t-1;	
        	ans=t;
        	System.out.println(ans);
        	}
        	else {
        		
        		ti=t+1;
        	}
        }
       System.out.println(ans); 
	}

}
