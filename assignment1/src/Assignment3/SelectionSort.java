package Assignment3;

import java.util.Scanner;

public class SelectionSort {
	public static int Sort(int []arr,int s,int e) {
		int min=Integer.MAX_VALUE;
		int index=0;
		for(int i=s;i<=e;i++) {
			if(arr[i]<min) {
				min=arr[i];
				index=i;
			}
		}
		return index;
	}
	public static void print(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int size = s.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= s.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			int minIndex=Sort(arr,i,arr.length-1);
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		
		print(arr);
	}

}
