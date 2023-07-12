package JavaMCQ;

import Oops.ThisAndSuper;

public class StaticVarible {
	static int MinimumAgeForVote =18;
	
	static
	{
		System.out.println("Initial value for MinimumAgeForVote " + MinimumAgeForVote );
	}
	
	public static void main(String[] args) {
		System.out.println("check value inside main method " +MinimumAgeForVote );
		StaticVarible Thiru = new StaticVarible();
		Thiru.getMinimumAgeForVote();
		StaticVarible venkadeh = new StaticVarible();
		venkadeh.setMinimumAgeForVote();
		System.out.println("double check MinimumAgeForVote "+MinimumAgeForVote);
		
	}
	void getMinimumAgeForVote()
	{
		System.out.println("check MinimumAgeForVote " + MinimumAgeForVote);
	}
	
	void setMinimumAgeForVote()
	{
		MinimumAgeForVote = 20;
		System.out.println("check MinimumAgeForVote  " + MinimumAgeForVote);
	}
	

}
