package assignment5;
import java.util.*;
public class readString {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str="IAmACompetitiveProgrammer";
		for(int i=0;i<str.length();i++) {
			if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90 ) {
				System.out.print(str.charAt(i));
			}
		}
		

	}

}
