package java11;
import java.util.Scanner;

public class Vote {
	void age(int a)
	{
		if(a>=18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			throw new ArithmeticException("Not Eligible for vote");
		}
	}

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		Vote v=new Vote();
		System.out.println("Enter your age");
		int a=Sc.nextInt();
		v.age(a);
		
		
		

	}

}
