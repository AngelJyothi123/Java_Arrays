package arrayDemonstration;
import java.util.*;
public class DuplicateElements {

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
		//duplicate elements
		System.out.print("the duplicates of the array is:");
		//int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(" " +a[i]+" ");
				}
				
				
			}
			
			
		}
		System.out.println();
		//remove the duplicate elemets

		HashSet<Integer> s=new HashSet<Integer>();
		for(int i=0;i<n;i++)
		{
			s.add(a[i]);
		}
		System.out.println("the duplicate removed array is :");
		System.out.print(s);
		sc.close();
	}

}
