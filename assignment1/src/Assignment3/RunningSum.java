package Assignment3;

import java.util.Scanner;

public class RunningSum {
public static void Sum(int []arr) {
	int []arr1 =new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		int sum1=0;
		for(int j=0;j<=i;j++) {
			
			sum1=arr[j]+sum1;
			arr1[i]=sum1;
			
		}
		System.out.print(arr1[i]+" ");
	}
	
}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size = s.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= s.nextInt();
			
		}
		Sum(arr);

	}

}
