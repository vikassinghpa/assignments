package assignment4;

import java.util.Scanner;

public class mummyMotivationalSpeech {
	public static boolean check(int mat[][],int m,int n) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(i-j<0 && mat[i][j]!=0) {
					return false;
				}
//				else if(i-j>0 && mat[i][j]==0) {
//					return false;
//				}
			
			}
			
		}
		return true;
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
		System.out.println(check(mat,m,n));


	}

}
