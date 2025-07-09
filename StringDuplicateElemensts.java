package arrayDemonstration;
import java.util.*;
public class StringDuplicateElemensts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the string array:");
		int n=sc.nextInt();
		System.out.println("enter the elemets of the string:");
		String a[]=new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		//printing the duplicate values
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
		
		
		//removing the duplicates:
		System.out.println("removing the duplicate values:");
		HashSet<String> d=new HashSet<String>();
		for(int i=0;i<n;i++)
		{
			d.add(a[i]);
		}
		System.out.println(d);
		sc.close();
	}

}
