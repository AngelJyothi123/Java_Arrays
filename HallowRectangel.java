package arrayDemonstration;

import java.util.Scanner;

public class HallowRectangel {

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
		//printitng the hallow triangle
		
			for(int j=0;j<c;j++)
			{
				System.out.print(a[0][j] +" ");
			}
			System.out.println();

			for(int i=1;i<r-1;i++)
			{
				for(int j=0;j<c;j++)
				{
					if(j==0 || j==c-1)
					{
						System.out.print(a[i][j]+" ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			for(int j=0;j<c;j++)
			{
				System.out.print(a[r-1][j] +" ");
			}
			System.out.println();

		sc.close();

	}

}


/*  
 * 1 2 3 4
 * 1 2 3 4
 * 1 2 3 4
 * 1 2 3 4
 *
 * */
