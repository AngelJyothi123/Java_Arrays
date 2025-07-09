package arrayDemonstration;

import java.util.Scanner;

public class BottomRightTriangleOfArray
{
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
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				
			{
				if(j<c-(i+1))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" "+a[i][j]);
				}
			}
			System.out.println();
			
		}
		sc.close();
	}

}

//when ever i==0 then we are going to add that i to the last index
/*for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
		if(j==c-i+1)
		{
			System.out.print(a[i][j]+" ");
		}
	e
	}
	{
		
	}
}*/


/*
 * 
 * 1 2 3 4
 * 1 2 3 4 
 * 1 2 3 4
 * 1 2 3 4
*/