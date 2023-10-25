package assignment5;

import java.util.*;

public class longestGoodSubString {
public static int subStringCount(char []arr,int s,int e) {
	int count=0;
	for(int i=s;i<=e;i++) {
		if(arr[i]=='a'|| arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
			count++;
		}
	}
	return count;
}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.next();
		char []arr=str.toCharArray();
         Arrays.sort(arr);
         int max=0;
         for(int i=0;i<arr.length;i++) {
        	 for(int j=i;j<arr.length;j++) {
        		int count= subStringCount(arr,i,j);
        		if(count>max) {
        			max=count;
        		}
        	 }
         }
         System.out.println(max-1);
	}

}
