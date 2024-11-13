// write a program to accept employee number, employee name and salary and display them back.
package basicsOfJava;

import java.util.Scanner;

public class EmpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		int eno=1;
		String ename="Jack";
		float sal=40000.00f;
		//variable value can be replacable any number of times
		System.out.println("Enter eno=");
		eno=x.nextInt();
		
		System.out.println("Enter employee name");
		ename=x.next();
		
		System.out.println("Enter salary=");
		sal=x.nextFloat();
		
		System.out.println("eno="+eno);
		System.out.println("ename="+ename);
		System.out.println("sal="+sal);

	}

}
