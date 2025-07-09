package arrayDemonstration;
import java.util.*;
public class MinMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the elements:");
		int n=sc.nextInt();
		System.out.println("enter the array elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("the sorted array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("the minimum element of the array: "+a[0]);
		System.out.println("the second minimum is :"+a[1]);
		System.out.println("the max:"+ a[n-1]);
		System.out.println("the second max is: "+a[n-2]);
		//kth minimium
		System.out.println("enter the minimum vakue index :");
		int k=sc.nextInt();
		
		System.out.println("the "+k +" th minimum is " + a[k-1]);
		
		//kth maximum
		System.out.println("enter the maxmium vakue index :");
		int k1=sc.nextInt();
		
		System.out.println("the "+k1 +" th maximum is " + a[n-k1]);
		
		sc.close();		
	}

}
