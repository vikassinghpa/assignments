package assignment5;

import java.util.Scanner;

public class palidromicSubString {
	public static int subStringCount(char []arr,int s,int e) {
		int count=0;
		int i=s,j=e;
		while(i<j) {
			if(arr[i]!=arr[j]) {
				return 0;
			}
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.next();
		char []arr=str.toCharArray();
		int max=0;
		for(int i=0;i<arr.length;i++) {
       	 for(int j=i;j<arr.length;j++) {
       		int count= subStringCount(arr,i,j);
       		if(count>max) {
       			max=count;
       		}
       	 }
        }
System.out.println(max+arr.length);
	}

}
