package classesAndObjects;

public class MainLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop obj = new Laptop();
		float p = obj.getLaptopPrice();
		obj.demo();
		System.out.println("Price of Laptop ="+p );
		HP objHP = new HP();
		objHP.demo();
		p=objHP.getLaptopPrice();
		System.out.println("Price of laptop using HP object ="+p);
		System.out.println(objHP.model);

	}

}
