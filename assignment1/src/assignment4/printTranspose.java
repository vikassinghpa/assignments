package assignment4;

import java.util.Scanner;

public class printTranspose {
	public static void print(int mat[][],int m, int n) {
		for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(mat[j][i]+" ");
				}
				System.out.println();
		}}
	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
		
		int m=s.nextInt();
		int n=m;
		int mat[][]= new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]=s.nextInt();
			}
		}
		print(mat,m,n);
	}

}
