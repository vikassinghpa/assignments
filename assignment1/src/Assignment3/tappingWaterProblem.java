package Assignment3;
import java.util.*;
public class tappingWaterProblem {
	 public static void trap(int[] height) {

		    int n= height.length;

		     int left[]=new int [n];
		     int right[]=new int[n];

		     left[0]=height[0];

		    for(int i=1; i<n;i++){

		        left[i]= Math.max(left[i-1], height[i]);
		    }

		    right[n-1]= height[n-1];

		    for(int i=n-2;i>=0;i--){

		        right[i]= Math.max(right[i+1], height[i]);
		    }

		    int sum=0;

		     for(int i=0; i<n;i++){

		        int currwater= Math.min(left[i], right[i])-height[i];
		         sum+=currwater;
		     }
		    System.out.println(sum);

		    }


		
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int testCase=s.nextInt();
		for(int i=1;i<=testCase;i++) {
			int size=s.nextInt();
			int[]arr=new int[size];
			for(int j=0;j<arr.length;j++) {
				arr[j]=s.nextInt();
				
			}
			trap(arr);
		}

	}

}
