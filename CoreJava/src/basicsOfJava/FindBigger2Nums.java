package basicsOfJava;

import java.util.Scanner;

public class FindBigger2Nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x= new Scanner(System.in);
		int a,b;
		System.out.println("Enter first number");
		a=x.nextInt();
		System.out.println("Enter second number");
		b=x.nextInt();
		if(a>b)
		{
			System.out.println(a+"is greater than"+b);
			
		}
		else if(a==b)
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println(b+"is greater than"+a);
		}
		
		
	}

}
