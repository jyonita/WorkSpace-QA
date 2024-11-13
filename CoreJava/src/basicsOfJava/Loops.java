package basicsOfJava;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x= new Scanner(System.in);
		int ch;
		System.out.println("1.Natural Numbers 2.Reverse 3.Even 4.Odd"+"\n" +"Enter your choice");
		ch=x.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Natural Numbers");
			for(int i=1;i<=10;i++)
			{
			System.out.println(i);
			}
			break;
		case 2:
			System.out.println("Reverse Natural Numbers");
			for(int i=10;i>=1;i--)//Reverse of above
			{
			System.out.println(i);
			}
			break;
		case 3:
			System.out.println("Even Numbers");
		int j=2;
		while(j<=10)
		{
			System.out.println(j);
			j=j+2;
		}
		case 4:
			System.out.println("Odd Numbers");
			int k=1;
			do 
			{
				System.out.println(k);
				k=k+2;
			} while(k<=10);
		break;
			default:
				System.out.println("Invalid choice entered");
		//For loops started from here
		
//		System.out.println("Natural Numbers");
//		for(int i=1;i<=10;i++)
//		{
//		System.out.println(i);
//		}
//		
//		System.out.println("Reverse Natural Numbers");
//		for(int i=10;i>=1;i--)//Reverse of above
//		{
//		System.out.println(i);
//		}
		
		
		//While loop started from here
//		System.out.println("Even Numbers");
//		int j=2;
//		while(j<=10)
//		{
//			System.out.println(j);
//			j=j+2;
//		}
		
		
		// do while loop started here
//		System.out.println("Odd Numbers");
//		int k=1;
//		do 
//		{
//			System.out.println(k);
//			k=k+2;
//		} while(k<=10);
		
		
		
		//Switch case started here
		
//		switch(expression) {
//		  case x:
//		    // code block
//		    break;
//		  case y:
//		    // code block
//		    break;
//		  default:
//		    // code block
//			}
		}
	}

}
