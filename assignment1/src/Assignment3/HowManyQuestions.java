package Assignment3;

import java.util.Scanner;

public class HowManyQuestions {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int row = s.nextInt();
		int [][]arr=new int[row][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<3;j++) {
			arr[i][j]=s.nextInt();
			}
			}
		int totalCount =0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<3;j++) {
			if(arr[i][j]==1) {
				count++;
			}
		}
			if(count>1) {
				totalCount++;
			}
		}
		System.out.println(totalCount);
		}
		

	}


