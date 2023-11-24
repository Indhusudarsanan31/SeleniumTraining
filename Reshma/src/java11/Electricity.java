package java11;
import java.util.Scanner;

public class Electricity {
	double tb,bill;
	void charge(double tb)
	{
		if(tb<=50)
		{
			System.out.println("Minimum payment amount= 50");
		}
		else if(tb>50&&tb<=250)
		{
			System.out.println("Total bill="+tb);
		}
		else if(tb>250)
		{
			tb=tb+tb*0.15;
			System.out.println("charges for overall unit consumed= "+tb);
		}
	}
void eb(int unit) {
	if(unit>=0&&unit<=100) {
		tb=unit*0.40;
		charge(tb);
	}
	else if(unit>=100&&unit<=300) {
		tb=(unit-100)*0.50+40;
		charge(tb);
	}
	
	else if(unit>300){
		tb=(unit-300)*0.60+40+100;
		charge(tb);
	}
	else {
		
		throw new ArithmeticException("enter valid unit");
	}
}

	public static void main(String[] args) {
    Electricity e=new Electricity();
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the eb unit:  ");
    int u=sc.nextInt();
    e.eb(u);
	}

}
