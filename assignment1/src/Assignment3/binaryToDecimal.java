package Assignment3;

import java.util.Scanner;

public class binaryToDecimal {
public static void Convert(int n) {
	int sum=0;
	int i=0;
	while(n>0) {
		int ld=n%10;
		sum=ld*(int)Math.pow(2, i)+sum;
		n=n/10;
		i++;
	}
	System.out.println(sum);
}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size = s.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= s.nextInt();
			Convert(arr[i]);
			}

	}

}
