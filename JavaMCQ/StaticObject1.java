package JavaMCQ;
public class StaticObject1 
{
	//static int age = 10;
	 int age = 10;
	public static StaticObject1 Thiru = new StaticObject1();
	//StaticObject1 Harini = new StaticObject1(); // stack overflow error why??
	static 
	{
		Thiru.add();//static object class non-static method
		System.out.println("I am static block");
	}
	protected  static void add()
	{
		System.out.println("it works");
		StaticObject1 Harini = new StaticObject1();
		Harini.age=17;
		System.out.println(" Harini non-static object change age"+Harini.age);
		System.out.println("Thiru static object "+Thiru.age);
		Thiru.age=21;
		System.out.println("After static object Thiru change value  "+ Harini.age);
		System.out.println("After Thiru redefine the age  "+ Thiru.age);
	}
	public static void main(String[] args) {
		//Thiru.add();\
	}
}
