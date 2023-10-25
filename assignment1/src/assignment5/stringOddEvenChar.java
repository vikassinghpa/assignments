package assignment5;

import java.util.Scanner;

public class stringOddEvenChar {
	public static char[] change(String str) {
		char []str1= new char[str.length()];
	      for(int i=0;i<str.length();i++) {
	    	  if(i%2==0) {
	    		  int num=(int)str.charAt(i)+1;
	    		  str1[i]= (char)num;
	    		
	    	  }
	    	  else if(i%2!=0) {
	    		  int num=(int)str.charAt(i)-1;
	    		  str1[i]= (char)num;
	    		  
	    	  }
	      }
	      
	    
	    return  str1;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.next();
		char []arr=change(str);
      for(int i=0;i<arr.length;i++) {
    	  System.out.print(arr[i]);
      } 

	}

}
