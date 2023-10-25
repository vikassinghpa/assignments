package assignment4;

import java.util.Scanner;

public class matrixSearch {
	static void find(int [][]mat,int m,int n,int target) {
		int i=0,j=n-1;
		while(i>=0 && i<m && j>=0 && j<n) {
			if(mat[i][j]==target) {
				System.out.println(1);
				return;
			}
			else if (mat[i][j]<target) {
				i++;
			}
			else if(mat[i][j]>target) {
				j--;
			}
		}
		System.out.println(0);
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
		int target =s.nextInt();
        find(mat,m,n,target);
	}

}
