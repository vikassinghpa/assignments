package assignment5;
import java.util.*;
public class stringWithMaxFrequency {
public static int count(char []arr, char ch) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if((int)arr[i]==(int)ch) {
		count++;
		}
	}
	
	return count;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.next();
		char []arr=str.toCharArray();
		int alpha= 0;
		int max=0;
		for(int i=0;i<arr.length;i++) {
			
			int count=count(arr,arr[i]);
			if(count>max) {
				max=count;
				alpha=arr[i];
			}
		}
		System.out.println((char)alpha);
		
	}

}
