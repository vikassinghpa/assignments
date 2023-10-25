package Assignment3;
import java.util.*;
public class InverseOfAnArray {
public static void Inverse(int []arr) {
	int i=0, j=arr.length-1;
	while(i<=j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
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
		Inverse(arr);
		print(arr);

	}

}
