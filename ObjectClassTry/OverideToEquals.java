package ObjectClassTry;
public class OverideToEquals {
	int age;
	int experiences;
	int salary;
	OverideToEquals()
	{
	}
	public OverideToEquals(int age, int experiences, int salary) {
		this.age=age;
		this.experiences = experiences;
		this.salary = salary;
	}
	public boolean toequals( OverideToEquals obj)
	{
		boolean check = false;
		if(this.experiences== obj.experiences && this.salary== obj.salary)
		{
			check=true;
		}
		return check;
	}
	public static void main(String[] args) {
		OverideToEquals obj1 = new OverideToEquals(21,1,25000);
		OverideToEquals obj2 = new OverideToEquals(23,3,50000);
		OverideToEquals obj3 = new OverideToEquals(25,3,50000);
		System.out.println(" check obj1 with obj2 " + obj1.toequals(obj2));
		System.out.println(" check obj2 with obj3 " + obj2.toequals(obj3));
	}
}
