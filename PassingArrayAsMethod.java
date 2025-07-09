package arrayDemonstration;

import java.util.Scanner;

public class PassingArrayAsMethod {

	// int method
	static void integer(int arr[], int s1) {
		System.out.println("the integer array is:");
		for (int i = 0; i < s1; i++) {
			System.out.print(arr[i]);
			if (i < s1 - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" ");

	}

	// float method

	static void floating(float arr[], int s2) {
		System.out.println("the float array is:");
		for (int i = 0; i < s2; i++) {
			System.out.printf("%.2f", arr[i]);
			if (i < s2 - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" ");
	}

	// double method;

	static void doublevalue(double arr[], int s3) {
		System.out.println("the double array is:");
		for (int i = 0; i < s3; i++) {
			System.out.print(arr[i]);
			if (i < s3 - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" ");
	}

	// String method

	static void stringvalues(String arr[], int s4) {
		//try {

			System.out.println("the String array is:");
			for (int i = 0; i < s4; i++) {
				System.out.print(arr[i]);
				if (i < s4 - 1) {
					System.out.print(", ");
				}
			}
			System.out.println(" ");
		/*} 
			catch (Exception e) {
			System.out.println("in catch block:");
			e.printStackTrace();
	}*/

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//integer
		System.out.println("enter the size of the integer array:");
		int s1=sc.nextInt();
		int a1[]=new int[s1];
		System.out.println("enter the elements:");
		for(int i=0;i<s1;i++)
		{
			a1[i]=sc.nextInt();
		}
		integer(a1,s1);
		
		//float
		System.out.println("enter the size of the floating point s array:");
		int s2=sc.nextInt();
		System.out.println("enter the floating points array:");
		float a2[]=new float[s2];
		for(int i=0;i<s2;i++)
		{
			a2[i]=sc.nextFloat();		
			
		}
		floating(a2,s2);
		//double
		
		System.out.println("enter the size of the double array:");
		int s3=sc.nextInt();
		System.out.println("enter the double array elements:");
		double a3[]=new double[s3];
		for(int i=0;i<s3;i++)
		{
			a3[i]=sc.nextDouble();
		}
		doublevalue(a3,s3);
		
		 
		//String
		System.out.println("enter the size of the String array:");
		int s4=sc.nextInt();
		System.out.println("enter the String array elements:");
		String a4[]=new String[s4];
		//try {
		for(int i=0;i<s4;i++)
		{
			a4[i]=sc.next();
		}
		stringvalues(a4,s4);
		/*}
		catch(Exception e)
		{
			System.out.println("inside the catch blOck");
			e.printStackTrace();
		}*/
		sc.close();

	}

}
