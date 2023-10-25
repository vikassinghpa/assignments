package assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class sortRowWise {

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
			for(int i=0;i<m;i++) {
				Arrays.sort(mat[i]);
			}
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(mat[i][j]+" ");
				}
				System.out.println();
			}

	}

}
