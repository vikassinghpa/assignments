package assignment4;

import java.util.Scanner;

public class printColummWise {
static void print(int mat[][],int m , int n) {
	for(int i=0;i<m;i++) {
		if(i%2!=0){
			for(int j=n-1;j>=0;j--) {
				System.out.print(mat[j][i]+",");
			}
			
		}
		else if(i%2==0) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[j][i]+",");
			}
			
		}
}
	System.out.println("END");
}
	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
		
		int m=s.nextInt();
		int n= s.nextInt();
		int mat[][]= new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]=s.nextInt();
			}
		}
		print(mat,m,n);

	}

}
