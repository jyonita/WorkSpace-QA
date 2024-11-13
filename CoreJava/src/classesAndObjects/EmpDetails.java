package classesAndObjects;

import java.util.Scanner;

public class EmpDetails {
	int eno;
	String ename;
	float sal;
	
	public EmpDetails() //this is constructor. same name as class name
	{
		System.out.println("Default constructor invoked....");
		eno=1;
		ename="george";
		sal=60000;
	}
	
	public EmpDetails(int eno1, String ename1, float sal1) //this is parameterized constructor
	{
		System.out.println("Parameterized constructor invoked....");
		eno=eno1;
		ename=ename1; 
		sal=sal1;
	}
	
	public EmpDetails(int eno1, String ename1) //this is parameterized constructor with two parameters
	{
		System.out.println("Parameterized constructor invoked with two parameters....");
		eno=eno1;
		ename=ename1;
		
	}
	
//There should not be constructor with same name and same number of parameters
//	public EmpDetails(int eno_d, String ename_d, float sal_d) 
//	{
//		System.out.println("Scanner invoked....");
//		eno=eno_d;
//		ename=ename_d;
//		sal=sal_d;
//	}
	
	
	public void disEmpDetails()
	{
		
		System.out.println("eno="+eno+"\t"+"ename="+ename+"\t"+"sal="+sal);
		
	}
	public static void main(String args[])
	{
		Scanner x= new Scanner(System.in);
		int eno_d;
		String ename_d;
		float sal_d;
		System.out.println("Enter eno, ename, salary");
		eno_d=x.nextInt();
		ename_d=x.next();
		sal_d=x.nextFloat();
		
		
		
		EmpDetails objscanner = new EmpDetails(eno_d, ename_d, sal_d);
		objscanner.disEmpDetails();
		
		EmpDetails obj = new EmpDetails();
		obj.disEmpDetails();
		
		EmpDetails obj1 = new EmpDetails(2, "tani",50000);
		obj1.disEmpDetails();
		
		EmpDetails obj2 = new EmpDetails(3, "jack");
		obj2.disEmpDetails();
		
		
	}

}
