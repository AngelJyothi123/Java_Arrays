package arrayDemonstration;

import java.util.Scanner;

public class TopLeftTriangleOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int r=sc.nextInt();
		System.out.println("enter the number of colums:");
		int c=sc.nextInt();
		System.out.println("enter the elements :");
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]= sc.nextInt();
			}
		}
		///print the top left traingle of the matrix
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c-i;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
