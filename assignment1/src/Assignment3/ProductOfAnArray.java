package Assignment3;

import java.util.Scanner;

public class ProductOfAnArray {
public static void product(long[]arr) {
	long []arr1= new long[arr.length];
	for(int i=0;i<arr.length;i++) {
		long product =1;
		for(int j=0;j<arr.length;j++) {
			if(j!=i) {
			product=arr[j]*product;
			}
		}
		arr1[i]=product;
	}
	for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]+" ");
	}
}

	

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size = s.nextInt();
		long []arr = new long[size];
		for(int i=0;i<size;i++) {
			arr[i]= s.nextLong();
			}
		product(arr);
		

	}

}
