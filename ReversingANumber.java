package arrayDemonstration;
import java.util.*;
public class ReversingANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //123
		int reverse=0;       //0 
		
		while(n!=0)
		{
			int num=n%10;  //3       2
			reverse= reverse*10+num;///0*10+3====3       3*10+2====32
			n=n/10;///123/10==12         12/10====1
			
			
		}
		if(n<0)
		{
			System.out.println("the negative reversed number is: -"+reverse);
		}
		else
		{
			System.out.println("the positvie reversed number is: "+reverse);
		}
		sc.close();
		
	}

}
///extract the digit and then store them in avariable and printing
// it i is negative number add the negative sign in fornt  of the number 
// if it starts with zero then we have to remove the zero and then we need to print  the revverse number ;
//it it has the ending zeores then we needd too we have to remove it or else we have to print it

