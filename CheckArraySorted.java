package arrayDemonstration;

import java.util.Scanner;

public class CheckArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of first array:");
		int n=sc.nextInt();
		System.out.println("enter the elemts:");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		//int min=a[0];
		int c=0;
		//int d=0;
		for(int i=1;i<n;i++)
		{
			if(a[i-1]<a[i])
			{
				c=c+1;
			}
			
		}
		if(c==n-1)
		{
			System.out.println("the given array is sorteed array");
		}
		else
		{
			System.out.println("the given array is not a sorted array");
		}
		sc.close();
	}

}
