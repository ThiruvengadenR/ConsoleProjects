package ObjectClassTry;

public class DefaultToEquals {
	String name;
	public static void main(String[] args) {
		DefaultToEquals obj1 = new DefaultToEquals();
		DefaultToEquals obj3 = obj1; // backup object 
		DefaultToEquals obj2 = new DefaultToEquals();
		obj1.name = "Thiru";
		obj2.name = "Harini";
		System.out.println("Comparing  two diffrent object using toequals method "+obj1.equals(obj2));
		System.out.println("Comparing object with backup object " + obj1.equals(obj3));
		System.out.println("name of obj1 " +obj1.name);
		System.out.println("name of obj2 " +obj2.name);
		System.out.println("name of obj3 " +obj3.name);
	}
}
