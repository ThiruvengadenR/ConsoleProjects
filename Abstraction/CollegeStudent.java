package Abstraction;
public class CollegeStudent extends CollegeRules {
	@Override
	void fine() 
	{
		System.out.println("For Every rules violation fine amount 200 ");
		setCollegeTime(10);
	}

	@Override
	void Examdate() 
	{
		System.out.println("Last week of every month you have cycle test ");
		System.out.println(getCollegeTime());
	}

	public static void main(String[] args) {
		CollegeStudent Thiru = new CollegeStudent();// Tightly coupled Relationship
		Thiru.fine();
		Thiru.Examdate();
		Thiru.license();
		CollegeRules .uniform();
		//CollegeRules  venkadesh = new CollegeRules ();
	}
}
