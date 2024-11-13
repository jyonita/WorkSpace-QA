//WAP to display the arithmetical operation as per the choice
//Output:-
//Enter first number
//Enter second number
//1.Add 2.Subtract 3.Multiplication
//Choose any of the above arithmetical operation


package basicsOfJava;

import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		int a,b,expression;
		System.out.println("Enter first number:");
		a=x.nextInt();
		System.out.println("Enter second number:");
		b=x.nextInt();
		System.out.println("1.Add"+"\n"+"2.Subtract"+"\n"+"3.Multiplication"+"\n"+"Choose any arithmetical option number from above:");
		expression=x.nextInt();
		if(expression==1) {
			System.out.println(a+b);
		}
		else if(expression==2)
		{
			System.out.println(a-b);
		}
		else if(expression==3)
		{
			System.out.println(a*b);
		}
		else
		{
			System.out.println("You entered invalid number");
		}

	}

}
