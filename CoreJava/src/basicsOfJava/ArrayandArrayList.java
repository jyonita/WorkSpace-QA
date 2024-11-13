package basicsOfJava;

import java.util.ArrayList;

public class ArrayandArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,50};
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		ArrayList<String> custNames = new ArrayList<String>();
		System.out.println("ArrayList size before storing elements = "+custNames.size());
		custNames.add("Jyonita");
		custNames.add("Riicha");
		custNames.add("Mihir");
		custNames.add("Snehitha");
		System.out.println("ArrayList size after storing elements = "+custNames.size());
		for(int i=0;i<custNames.size();i++)
		{
			System.out.println(custNames.get(i));
		}
		custNames.add("Arpana");
		custNames.add(2,"raj");
		System.out.println("ArrayList size after adding elements = "+custNames.size());
		
		for(int i=0;i<custNames.size();i++)
		{
			System.out.println(custNames.get(i));
		}
		custNames.set(4, "kriya");
System.out.println("ArrayList size after adding elements = "+custNames.size());
		
		for(int i=0;i<custNames.size();i++)
		{
			System.out.println(custNames.get(i));
		}
		if (custNames.contains("kriya"))
		{
			System.out.println("Customer Name exists");
		}
		else
		{
			System.out.println("Customer name does not exits");
		}
		custNames.remove(5);
		for(int i=0;i<custNames.size();i++)
		{
			System.out.println(custNames.get(i));
		}
				
	}

}
