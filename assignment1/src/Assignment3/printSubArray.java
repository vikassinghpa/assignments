package Assignment3;

import java.util.Scanner;

public class printSubArray {
	static int sum(int []arr ,int i,int j) {
		int sum=0;
		for(int l=i;l<j;l++) {
		for(int k=i+1;k<j;k++) {
			
			sum=arr[l]+arr[k];
		}
		System.out.println();
	}
	return sum;	
	}
	static void print(int []arr,int i,int j) {
		
			for(int k=i;k<=j;k++) {
				System.out.print(arr[k]+" ");
	}
			System.out.println();
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int largestSum=Integer.MIN_VALUE;
		int size = s.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= s.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int sum=sum(arr,i,j);
				print(arr,i,j);
			if( sum>largestSum) {
				largestSum=sum;
			}
			}
		}
		System.out.println(largestSum);
	}

}
