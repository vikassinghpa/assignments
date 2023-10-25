package assignment4;

import java.util.Scanner;

public class ColumnWithMaximumSumInAMatrix {
public static void findMax(int mat[][],int m,int n) {
	int max=Integer.MIN_VALUE;
	int index=-1;
	for(int i=0;i<m;i++) {
		int sum=0;
		int j=0;
			for(j=j;j<n;j++) {
				sum=sum+mat[i][j];
			}
		System.out.println(sum);
			if(sum>max) {
				max=sum;
				index=j-1;
			}
	}
	System.out.println(max);
	System.out.println(index);
}
	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
		
		int m=s.nextInt();
		int n= m;
		int mat[][]= new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				mat[j][i]=s.nextInt();
			}
		}
		findMax(mat,m,n);

	}

}
