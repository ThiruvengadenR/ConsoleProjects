package ObjectClassTry;

public class OverRideToString {
	String name;
	int age;
	int total;
	public OverRideToString(String name, int age, int total) {
		this.name = name;
		this.age=age;
		this.total = total;
		
	}
	public String toString()
	{
		
		return ("Student name " + this.name+ " age "+this.age+" 10th mark "+this.total);
		
	}
	public static void main(String[] args) {
		OverRideToString obj1 = new OverRideToString("Thiru" , 21,455);
		OverRideToString obj2 = new OverRideToString("Harini" ,17 ,405);
		System.out.println(obj1);
		System.out.println(obj2);
		
	}

}
