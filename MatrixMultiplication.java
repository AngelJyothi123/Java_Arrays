package arrayDemonstration;
import java.util.*;
public class MatrixMultiplication {
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
	 int b[][]= new int[r][c];
		
		//performing the matrix multiplication
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				for(int k=0;k<c;k++)
				{
					b[i][j]+=a[i][k]*a[k][j];
				}
			}
		}
		
		//Printing the matrix multiplication 
		System.out.println("the matrix multiplication is:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
		sc.close();	
		
	}

}



/*
 * 2 2      2
 * 2 2     2 2 
 * 
 * 1+6    2+8
 * 
 */
