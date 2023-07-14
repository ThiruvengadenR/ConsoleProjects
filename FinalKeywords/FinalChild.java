package FinalKeywords;

final public class FinalChild extends FinalKeyword
{ // Finalchild class cannot extend by any other class
	int age;
	double height;
	String name;
		//	void wearId()
		//	{
		//		System.out.println("not wear id card");
		//	} 
		// wearId is final method in parent class therefore it cannot be override by child class
	
	FinalChild()
	{
		System.out.println("Zero-args Constructor ");
	}
	
	FinalChild(int age , double height ,String name)
	{
		this.age=age;
		this.height = height;
		this.name = name;
		System.out.println("Three-parameterised Constructor");
		System.out.println(this.name+ " age is " + this.age);
		System.out.println(this.name+ " height is " + this.height);
	}
	
	void playGame() // child class method  override the parent class method
	{
		System.out.println("Cricket is my favorite game ");
	}
	void age(int age )
	{
		
	}
	public static void main(String[] args) {
		FinalChild obj = new FinalChild();
		obj.wearId();
		obj.playGame();
		final FinalChild Harini = new FinalChild(17,5.3,"Harini");
		Harini.age(21);
		System.out.println(Harini.age);

	}

}
