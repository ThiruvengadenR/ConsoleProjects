package ThisAndSuper;

import whileloop.Calculator;

public class ScitificCalculator extends Calculator {
	int price = 1000;
	String color ;
	int manufacturingYear ;
	
	ScitificCalculator()
	{
		System.out.println("zero -args constructor in scitificCalculator");
	}
	
	ScitificCalculator(String color ,int manufacturingYear)
	{
		super(color,manufacturingYear);
		this.color=color;
		this.manufacturingYear =manufacturingYear;
		
	}
	public static void main(String[] args) {
		ScitificCalculator sobj = new ScitificCalculator("blue",2020);
		sobj.add(5,12);
		//sobj.price(price);
//		System.out.println("Price of the scitific calculator is " + this.price);
//		System.out.println("Price of the  Calculator is " + super.price);
	}
	void price()
	{
		System.out.println("Price of the scitific calculator is " + this.price);
		System.out.println("Price of the  Calculator is " + super.price);
	}
	void add(int a , int b)
	{
		super.add(a,b);
		System.out.println("Addition in scitificCalculator  " + (a+b));
	}

}
