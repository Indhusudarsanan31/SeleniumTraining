import java.util.Scanner;
class Employe1
{
	String name;
	int id;
	double salary; 
void Empinfo()
{
Scanner Sc=new Scanner(System.in);
	System.out.println("Enter name");
	 name=Sc.next();
	System.out.println("Enter id");
	id=Sc.nextInt();
	System.out.println("Enter salary");
	salary=Sc.nextInt();
}
}
public class Marketting extends Employe1
{
	int inst;
	void Empinfo()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the incentive");
		inst=Sc.nextInt();
		int netpay=(int) (inst+salary);
		System.out.println("net pay of Employe "+netpay);
	}


	public static void main(String[] args) 
	{
		Employe1 Emp1=new Employe1();
		Emp1.Empinfo();
		Marketting M=new Marketting();
		M.Empinfo();
	}

	}
	
