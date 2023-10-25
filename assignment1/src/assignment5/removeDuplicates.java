package assignment5;

import java.util.*;

public class removeDuplicates {
public static int count(char []arr,char n, int s) {
	int count=0;

	for(int i=s;i<arr.length;i++) {
		if((int)arr[i]==(int)n) {
			count++;
		}
		else {
			break;
		}
}
	return count;
}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.next();
		char []arr=str.toCharArray();
		int jump=0;
		for(int i=0;i<arr.length;i=i+jump) {
			System.out.print(arr[i]);
			jump=count(arr,arr[i],i);
		}
	}

}
