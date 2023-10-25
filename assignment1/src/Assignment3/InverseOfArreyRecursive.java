package Assignment3;

import java.util.Scanner;

public class InverseOfArreyRecursive {
static void swap(int[]arr,int si,int ei){
	if(si>=ei)
		return;
        int temp=arr[si];
        arr[si]=arr[ei];
        arr[ei]=temp;
        swap(arr,si+1,ei-1);
        return;
}
static void print(int []arr) {
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

		swap(arr,1,arr.length-1);
        print(arr);
	}

}
