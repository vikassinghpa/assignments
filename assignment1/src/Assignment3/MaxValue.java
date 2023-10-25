package Assignment3;

import java.util.Scanner;

public class MaxValue {
public static int FindMax(int[]arr) {
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int size = s.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= s.nextInt();
			
		}
		System.out.println(FindMax(arr));
	}

}
