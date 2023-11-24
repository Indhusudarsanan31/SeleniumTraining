package java11;
import java.util.Scanner;
class Bank
{
	void input()
	{
	Scanner Sc=new Scanner(System.in);
	int r=3,p,n;
	System.out.println("Enter p amout");
	p=Sc.nextInt();
	System.out.println("Enter no.of years");
	n=Sc.nextInt();
	}

 void InterestCal()
 {
	 int i= (p*n*r)/100;
	 System.out.println("Simple interest"+i);
 }
	 
 }



public class Testname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
