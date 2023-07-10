package whileloop;

public class Calculator {
	final static int price = 500;
	String color ;
	int manufacturingYear ;
	
	public Calculator()
	{
		System.out.println("zero -args constructor in Calculator");
	}
	
	public Calculator(String color ,int manufacturingYear)
	{
		this.color=color;
		this.manufacturingYear =manufacturingYear;
		System.out.println("Two -args constructor in Calculator");
		int price1=price;
		System.out.println(" try " + price1);
	}
	
	public static void main(String[] args) {
		Calculator cobj = new Calculator("black",2019);
		cobj.add(5,10);
		cobj.sub(5,12);
	}
	void add(double a , double b)
	{
		System.out.println("Addition in Calculator  " + (a+b));
	}
	void sub(int a , int b)
	{
		System.out.println("Substraction in Calculator  " + (a-b));
	}

}
