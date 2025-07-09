package arrayDemonstration;

import java.util.*;
public class MatrixSub {
	public static void main(String[] args)
	{
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
		System.out.println("enter the second array elements:");
		
		//second array
		int b[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]= sc.nextInt();
			}
		}
		
		int d[][]=new int[r][c];
		//performing the addition
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				d[i][j]=a[i][j]-b[i][j];
			}
		}
		
		
		//printing the elemets of the added array
		System.out.println("the added matrix is :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}

