package Assignment3;

import java.util.Scanner;

public class InsertionSort {
	public static void insert(int [] arr, int i, int item) {


		 while(i>=0 &&  arr[i]>item) {

			 arr[i+1]=arr[i]; 
			 i--;
		 }

		 arr[i+1]=item;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int size = s.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= s.nextInt();
			
		}
		 for(int i=1; i<arr.length;i++) {

	    	   insert(arr, i-1,arr[i]);
	       }

	       for(int i=0; i<arr.length;i++) {
	    	   System.out.print(arr[i]+" ");
	       }
	}

}
