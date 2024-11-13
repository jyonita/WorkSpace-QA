package classesAndObjects;

public class MainCustInfo {

	
	
		

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				CustInfo obj = new CustInfo();
				obj.setData();
			obj.dispCustInfo();
			int res = obj.displayTotal();
			System.out.println("total1="+res);
			obj.getCustData(2, "George", 20, 5);
			 res = obj.displayTotal();
			 obj.dispCustInfo();
			System.out.println("total2="+res);
			res=obj.getCustDataandReturn(3, "Jen", 50, 2);
			System.out.println("total3="+res);
	}

}
