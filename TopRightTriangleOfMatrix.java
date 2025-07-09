package arrayDemonstration;
import java.util.Scanner;
public class TopRightTriangleOfMatrix {
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
		///print the top right traingle of the matrix
		for(int i=0;i<r;i++)
		{
			
			for(int j=0;j<c;j++)
			{
				if(j<i)
				{
					System.out.print("  ");
					
				}
				else
				{
				System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
			
			
		}
		sc.close();
	}
}


/*  0 1 2
0   1 2 3 4 5
1   1 2 3 4 5
2   1 2 3 4 5 
3    1 2 3 4 5
4    1 2 3 4 5
    */