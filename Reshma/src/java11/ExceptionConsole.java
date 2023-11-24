package java11;
import java.util.Scanner;

public class ExceptionConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the Amout");
			int p=Sc.nextInt();
			System.out.println("Enter the year");
			int n=Sc.nextInt();
			System.out.println("Enter the rate interest");
			int r=Sc.nextInt();
			double i=p*n*r/100;
			double total=p+i;
			System.out.println("simple interest : "+i);
			System.out.println("Total amount : "+total);
		}
		catch (ArithmeticException e)
		{
			System.out.println("by zero");
		}
		

	}

}
