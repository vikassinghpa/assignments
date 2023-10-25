package assignment5;

import java.util.*;

public class palidromeString {
public static boolean check(char []arr) {
	int i=0,j=arr.length-1;
	while(i<j) {
		if(arr[i]!=arr[j]) {
			return false;
		}
		i++;
		j--;
	}
	return true;
}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.next();
		char []arr=str.toCharArray();
		
        System.out.println(check(arr));
	}

}
