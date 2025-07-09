package arrayDemonstration;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the first array:");
		int n1=sc.nextInt();
		System.out.println("enter the first array elements:");
		int a[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the size of the second array:");
		int n2=sc.nextInt();
		System.out.println("enter the second array elements:");
		int b[]=new int[n2];
		for(int i=0;i<n2;i++)
		{
			b[i]=sc.nextInt();
		}
		int c[]=new int[n1+n2];
		for(int i=0;i<c.length;i++)
		{
			if(i<n1) {
				c[i]=a[i];
			}
			else
			{
				c[i]=b[i-n1];
			}
		}
		Arrays.sort(c);
		System.out.println("the merged array is:");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
		
		
		sc.close();
		
	}

}



/* 1 2 3 4 5
 * 1 2 3 4 5
 * 
 *  0 1 2 3 4     | 5 6 7 8 9
 *  1 2 3 4 5     | 1 2 3 4 5
 *                  0 1 2 3 4
 *
 */               
/*
 * 
 */







