package arrayDemonstration;
import java.util.*;
public class InsetingElemtent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		System.out.println("enter the elemets of the array:");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the index to insert an element");
		int index=sc.nextInt();
		System.out.println("enter the element to inserrt at the specitfic position");
		int ele=sc.nextInt();
		int b[]=new int[n+1];
		
		for(int i=0;i<b.length;i++ )
		{
			if(i<index)
			{
				b[i]=a[i];
			}
			else if(i==index)
			{
				b[i]=ele;
			}
			else
			{
				b[i]=a[i-1];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print( b[i]+" ");
		}
		sc.close();
		
	}

}
// 0  1  2  3  4
/* 1  2  3  4  5
 * a  b  c  d  e  f
 * 1  2  6  3  4  5
 * 
 * i need to an array  with size of n+1
 *  a b c d e f
 *  0 1 2 3 4 5
 */
//add element at index one
