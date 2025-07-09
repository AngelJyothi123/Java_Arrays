package arrayDemonstration;
import java.util.*;
public class ArrayUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		//float
		System.out.println("enter the size of the floating point s array:");
		int s2=sc.nextInt();
		System.out.println("enter the floating points array:");
		float a2[]=new float[s2];
		for(int i=0;i<s2;i++)
		{
			a2[i]=sc.nextFloat();		
			
		}
		//double
		
		System.out.println("enter the size of the double array:");
		int s3=sc.nextInt();
		System.out.println("enter the double array elements:");
		double a3[]=new double[s3];
		for(int i=0;i<s3;i++)
		{
			a3[i]=sc.nextDouble();
		}
		
		
		//String
		System.out.println("enter the size of the String array:");
		int s4=sc.nextInt();
		System.out.println("enter the String array elements:");
		String a4[]=new String[s3];
		for(int i=0;i<s4;i++)
		{
			a4[i]=sc.next();
		}
		
		
		
		//integer print();
		System.out.println("the integer array is:");
		for(int i=0;i<s1;i++)
		{
			System.out.print(a1[i]);
			if(i<s1-1)
			{
				System.out.print(", ");
			}
		}
		System.out.println(" ");
		
		
		//float print();
		
		System.out.println("the float array is:");
		for(int i=0;i<s2;i++)
		{
			System.out.printf("%.2f",a2[i]);
			if(i<s2-1)
			{
				System.out.print(", ");
			}
		}
		System.out.println(" ");
		
		
		//double print();
		
		
		System.out.println("the double array is:");
		for(int i=0;i<s3;i++)
		{
			System.out.print(a3[i]);
			if(i<s3-1)
			{
				System.out.print(", ");
			}
		}
		System.out.println(" ");
		
		
		//string print();
		
		
		System.out.println("the String array is:");
		for(int i=0;i<s4;i++)
		{
			System.out.print(a4[i]);
			if(i<s4-1)
			{
				System.out.print(", ");
			}
		}
		System.out.println(" ");
		sc.close();
	}

}
