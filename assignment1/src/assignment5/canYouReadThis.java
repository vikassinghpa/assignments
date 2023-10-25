package assignment5;

import java.util.*;

public class canYouReadThis {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str="IAmACompetitiveProgrammer";//s.next();
		char []arr=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			
		if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90) {
			System.out.println();
		}
		System.out.print(str.charAt(i));
		}
	}

}
