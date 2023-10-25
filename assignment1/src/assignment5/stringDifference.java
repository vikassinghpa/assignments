package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class stringDifference {
public static int difference(char []arr,char m ,char n) {
//	System.out.println((int)n-(int)m);
	return (int)n-(int)m;
}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.next();
		char []arr=str.toCharArray();
//		Arrays.sort(arr);
         for(int i=0;i<arr.length-1;i++) {
        	int diff= difference(arr,arr[i],arr[i+1]);
        	System.out.print(arr[i]);
        	System.out.print(diff);
         }
         System.out.println(arr[arr.length-1]);
	}

}
