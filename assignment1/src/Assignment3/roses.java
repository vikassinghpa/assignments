package Assignment3;

import java.util.*;
import java.util.Scanner;

public class roses {
	public static void sum(int[]arr,int target) {
		int min=Integer.MAX_VALUE;
		int x=0,y=0;
		for(int j=0;j<arr.length;j++) {
		for(int i=j+1;i<arr.length;i++) {
			if(arr[i]+arr[j]==target && arr[i]-arr[j]<min) {
				min=arr[i]-arr[j];
				x=arr[i];
				y=arr[j];
				}
			}
		}
		System.out.println("Deepak should buy roses whose prices are "+x+" and "+ y+".");
	}
    public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int testCases=s.nextInt();
		int t=1;
		while(t<=testCases) {
		int size = s.nextInt();
		int []arr = new int[size];
		  for(int i=0;i<size;i++) {
			arr[i]= s.nextInt();
		}
		int target =s.nextInt();
		Arrays.sort(arr);
		sum(arr,target);
		System.out.println();
		t++;
		}
		
	}
}

