package Assignment3;
import java.util.*;
import java.util.Scanner;

public class SumTripllet {
public static void sum(int []arr,int target) {
	
	for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length-1;j++)	
      for(int k=j+1;k<arr.length-2;k++) {
				if(arr[i]+arr[j]+arr[k]==target) {
					System.out.println(arr[i] + ","+arr[j] +","+"and "+arr[k]);
				}	
		}
   
	}
}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size = s.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= s.nextInt();
			
		}
		Arrays.sort(arr);
		
		int target = s.nextInt();
		sum(arr,target);
	}

}
