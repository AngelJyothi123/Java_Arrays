package arrayDemonstration;
import java.util.*;
public class TransposeOFArray {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int r=sc.nextInt();
		System.out.println("enter the number of colums:");
		int c=sc.nextInt();
		
		System.out.println("enter the elements:");
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("the transpose of the matrix is :");
		
		if(r==c)
		{
			System.out.println("for symmetric matrix is :");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					System.out.print(a[j][i]+ " ");
				}
				System.out.println();
			}
		}
		
		// for non symmertic matrix we need to inter change the rows and the columns
		
		else
		{
			System.out.println("for non symmetric matrix:");
			for(int i=0;i<c;i++)
			{
				for(int j=0;j<r;j++)
				{
					System.out.print(a[j][i]+" ");
				}
				System.out.println();
			}
		}
		sc.close();
		
	}

}
