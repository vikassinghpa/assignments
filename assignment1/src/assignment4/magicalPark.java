package assignment4;

import java.util.Scanner;

public class magicalPark {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int minStrength=s.nextInt();
        int totalStrength=s.nextInt();
        int  loss=2,step=1,gain=5;
        String [][]mat=new String[m][n];
        for(int i=0;i<m;i++) {
        	for(int j=0;j<n;j++) {
        		mat[i][j]=s.next();
        	}
        }
        int i=0;
        while(totalStrength>minStrength  && i<m) {
        	for(int j=0;j<n;j++) {
        		if(mat[i][j].equals(".")&& j!=n-1) {
        			totalStrength=totalStrength-step-loss;
        		}
        		if(mat[i][j].equals(".")&& j==n-1) {
        			totalStrength=totalStrength-loss;
        		}
        		
        		else if(mat[i][j].equals("*")&& j!=n-1) {
        			totalStrength=totalStrength-step+gain;
        		}
        		else if(mat[i][j].equals("*")) {
        			totalStrength=totalStrength+gain;
        		}
        		else if(mat[i][j].equals("#")) {
        			i++;
        			j=0;
        		}
        	}
        }
        System.out.println(totalStrength);
        if(totalStrength>=minStrength) {
        System.out.print("yes");
        }
        else
        	System.out.println("no");
        
	}

}
