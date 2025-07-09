package arrayDemonstration;
import java.util.*;
public class MultiDimentionalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the rows");
		int n1=sc.nextInt();
		System.out.println("enter the size of the cloumns");
		int n2=sc.nextInt();
		int a[][]=new int[n1][n2];
		System.out.println("enter the elements of the first array:");
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("the first array is");
		for(int i=0;i<n1;i++)
		{
			System.out.print("{");
			for(int j=0;j<n2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("}");
		}
		System.out.println(" ");
		
		//second array
		System.out.println("Second array");
		System.out.println("the first array length of the row is:"+a.length);
		System.out.println("the first array length of the column is:"+a[0].length);		


		int b[][]= {{1,2},{3,4}};
		System.out.println("the first array is");
		for(int i=0;i<b.length;i++)
		{
			System.out.print("{");
			for(int j=0;j<b[0].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println("}");
		}
		System.out.println(" ");
		sc.close();
	}

}
