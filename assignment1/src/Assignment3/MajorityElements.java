package Assignment3;

import java.util.Scanner;

public class MajorityElements {
public static int count(int []arr, int num ) {
	int count1=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==num) {
			count1++;
		}
	}
	
	return count1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int size = s.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= s.nextInt();
			if(count(arr,arr[i])>size/3) {
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}

}
