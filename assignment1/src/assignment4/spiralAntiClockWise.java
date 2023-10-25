package assignment4;

import java.util.Scanner;

public class spiralAntiClockWise {
public static void print(int mat[][],int m, int n) {
	int i=-1, j=0 , total=m*n,count=0;
	int L=0,R=0,T=0,B=0;
	while(count<total) {
		for( i=i+1;i<m-B && count<total;i++) {
			System.out.print(mat[j][i]+",");
			count++;
		}
		L++;
		i--;
		for(j=j+1;j<n-R && count<total;j++) {
			System.out.print(mat[j][i]+",");
			count++;
			
		}
		B++;
		j--;
		
		
		for(i=i-1;i>=0+T && count<total;i--) {
		System.out.print(mat[j][i]+",");
			count++;
			
		}
		i++;
		R++;
		
		for(j=j-1;j>=0+L && count<total;j--) {
			System.out.print(mat[j][i]+",");
			count++;
			
		}
		j++;
		T++;
		
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
