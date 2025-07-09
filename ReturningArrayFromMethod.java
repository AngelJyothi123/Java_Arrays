package arrayDemonstration;
import java.util.*;
public class ReturningArrayFromMethod {
	
	static void add(int a1[],int a2[])
	{
		int c[]=new int[a1.length];
		for(int i=0;i<c.length;i++)////1
		{
			c[i]=a1[i];
			c[i]=c[i]+a2[i];
		}
		System.out.println("the sum of the two arrays is :");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+ " ");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the both array:");
		int n=sc.nextInt();
		System.out.println("enter the first array elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the second array elements");
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		add(a,b);
		
		
		
		sc.close();

	}

}
