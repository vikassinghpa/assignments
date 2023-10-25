package assignment4;
import java.util.*;
public class rotateMatix {
public static void transpose(int [][]mat,int m,int n) {
	for(int i=0;i<m;i++) {
    	for(int j=i;j<n;j++) {
    		int temp=mat[i][j];
    	  mat[i][j]=mat[j][i];
    	  mat[j][i]=temp;
    	}
}
}
public static void rowwise(int [][]mat,int m,int n) {
	for(int i=0;i<m/2;i++) {
    	for(int j=0;j<n;j++) {
    		int temp=mat[i][j];
    		mat[i][j]=mat[m-i-1][j];
    		mat[m-i-1][j]=temp;
    	}
    	}
}
public static void print(int [][]mat,int m,int n) {
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
		System.out.print(mat[i][j]+" ");
	}
	System.out.println();
	}
}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        int m=s.nextInt();
        int n=m;
        int [][]mat=new int[m][n];
        for(int i=0;i<m;i++) {
        	for(int j=0;j<n;j++) {
        		mat[i][j]=s.nextInt();
        	}
        }
        transpose(mat,m,n);
        rowwise(mat,m,n);
        print(mat,m,n);
	}

}
