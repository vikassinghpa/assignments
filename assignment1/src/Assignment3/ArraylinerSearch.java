package Assignment3;

import java.util.Scanner;

public class ArraylinerSearch {
public static int Search(int []arr,int target) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==target) {
			return i;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int size = s.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= s.nextInt();
			
		}
		int target = s.nextInt();
		System.out.println(Search(arr,target));
	}

}
