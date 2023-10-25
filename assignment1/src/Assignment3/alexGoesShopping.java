package Assignment3;

import java.util.Scanner;

public class alexGoesShopping {
  static void shopping(int[]arr,int money,int item) {
	  int count=0;
	  for(int i=0;i<arr.length;i++) {
		  for(int j=1;j<arr[i];j++) {
			  if(arr[i]*j==money) {
				  count++;
			  }
		  }
	  }
	  if(count==item) {
		  System.out.println("Yes");
	  }
	  else {
		  System.out.println("No");
	  }
  }
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size = s.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= s.nextInt();
			}
        int testCases=s.nextInt();
        for(int i=1;i<=testCases;i++) {
        	int money =s.nextInt();
        	int item =s.nextInt();
        	shopping(arr,money,item);
        }
        }

}
