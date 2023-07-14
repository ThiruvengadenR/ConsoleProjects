package FinalKeywords;

public class FinalVariable {
	
	static final int mimimumAgeForDriving = 18;
	static final int minimumAgeForAdhaar ;
	int minimumAgeForSchool;
	
	static
	{
		minimumAgeForAdhaar =3;
	}
	
	FinalVariable()
	{
		this.minimumAgeForSchool = 3;
	}
	FinalVariable(int age)
	{
		this.minimumAgeForSchool = age;
	}
	
	public static void main(String[] args) {
		FinalVariable Babe = new FinalVariable();
		FinalVariable Babe1 = new FinalVariable(5);
		System.out.println("Minimum age for school "+Babe1.minimumAgeForSchool);
		System.out.println("Minimum age for school "+Babe.minimumAgeForSchool);

	}

}
