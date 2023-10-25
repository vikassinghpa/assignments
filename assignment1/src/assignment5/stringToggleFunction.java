package assignment5;

import java.util.Scanner;

public class stringToggleFunction {
public static char[] change(String str) {
	char []str1= new char[str.length()];
      for(int i=0;i<str.length();i++) {
    	  if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90) {
    		  int num=(int)str.charAt(i)+32;
    		  str1[i]= (char)num;
    		
    	  }
    	  else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122) {
    		  int num=(int)str.charAt(i)-32;
    		  str1[i]= (char)num;
    		  
    	  }
      }
      
    
    return  str1;
}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str="IAmACompetitiveProgrammer";
		char []arr=change(str);
      for(int i=0;i<arr.length;i++) {
    	  System.out.print(arr[i]);
      } 
	}

}

