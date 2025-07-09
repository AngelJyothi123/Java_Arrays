package arrayDemonstration;

import java.util.Scanner;

public class EvenOddSeperatePrinting {

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
			
		int even=0;
		int odd=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				even=even+1;
			}
			else
			{
				odd=odd+1;
			}
		}
		int b[]=new int[even];
		int c[]=new int[odd];
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				b[i]=a[i];
			}
			else
			{
				c[i]=a[i];
			}
		}
		sc.close();
	}

}

/*   1 5 4 2 6 3
 *   oddd=3;
 *   even=3;
 * 
 * 
 * 
 * 
 * 
 */
