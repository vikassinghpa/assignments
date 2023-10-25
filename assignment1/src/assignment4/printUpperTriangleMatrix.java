package assignment4;

import java.util.Scanner;

public class printUpperTriangleMatrix {
public static void print(int mat[][],int m,int n) {
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			if(i-j>0) {
				System.out.print(0+" ");
			}
			else
		System.out.print(	mat[i][j]+" ");
		}
		System.out.println();
	}
}
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
