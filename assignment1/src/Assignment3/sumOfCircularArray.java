package Assignment3;

import java.util.Scanner;

public class sumOfCircularArray {
static void sum(int []arr,int x) {
	int n=arr.length;
	int []arr1=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		arr1[i]=arr[i]+arr[(n-x+i)%n];
	}
	for(int i=0;i<arr.length;i++) {
		arr[i]=arr1[i];
	}
}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size = s.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= s.nextInt();
			}
		int operation =s.nextInt();
		for(int i=1;i<=operation;i++) {
			int x=s.nextInt();
			sum(arr,x);
		}
		int sum=0;
       for(int i=0;i<arr.length;i++) {
    	   sum=arr[i]+sum;
       }
       System.out.println(sum);
	}

}
