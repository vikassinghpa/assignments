package Assignment3;

import java.util.Scanner;

public class BubbleSort {
public static void Sort(int []arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=1;j<arr.length;j++) {
			if(arr[j]<arr[j-1]) {
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
	}
}
public static void print(int []arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size = s.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= s.nextInt();
			}
		Sort(arr);
		print(arr);

	}

}
