package classesAndObjects;

public class CustInfo {
	int cno,qty,price,total;
	String cname;
	
	public void setData()  //method with no return type and no parameter
	{
		System.out.println("Inside the setData");
		cno=1;
		cname="jack";
		qty=10;
		price=50;
	}
	public void dispCustInfo()
	{
		System.out.println("CUstomer details--");
		System.out.println("Cno="+cno);
		System.out.println("Cname="+cname+"\t"+"qty="+qty+"\t"+"price="+price);
	}
	public int displayTotal() //method with return type and no parameter
	{
		total=qty*price;
		return(total);

	}
	
	//method with no return type and with parameter
	public void getCustData(int cno1,String cname1, int qty1,int price1)
	{
		cno=cno1;
		cname=cname1;
		qty=qty1;
		price=price1;
		
	}
	
	//method with return type and with parameter
	public int getCustDataandReturn(int cno1,String cname1, int qty1,int price1)
	{
		cno=cno1;
		cname=cname1;
		qty=qty1;
		price=price1;
		dispCustInfo();
		total=qty*price;
		return(total);
		
	}

}
