package java11;
import java.util.Scanner;
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int [4];
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]=");
			a[i]=Sc.nextInt();
		}
		System.out.println("First index");
		int F=Sc.nextInt();
		System.out.println("Second index");
		int S=Sc.nextInt();
		try
		{
			double quo=a[F]/a[S];
			System.out.println("Quotient : "+quo);
			double rem=a[F]%a[S];
			System.out.println("Remainder : "+rem);
		}
		catch(ArithmeticException e)
		{
			System.out.println("can't divied by zero");
		}
		
			
		

	}

}
