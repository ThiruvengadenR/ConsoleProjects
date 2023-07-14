package FinalKeywords;

 class FinalKeyword // final class cannot be extend
{
	final static String collegeName = "Anjalai Ammal Mahalingam Engineering College";
	    // collegename as final therefore unable to re-initialize the variable.
	String StudentName ;
	FinalKeyword()
	{
		System.out.println("Zero-args Constructor");
	}
	FinalKeyword (String StudentName )
	{
		this.StudentName = StudentName;
		System.out.println("StudentName is " + StudentName);
	}
	public static void main(String[] args) {
		FinalKeyword fobj = new FinalKeyword("Thiru");
			//collegeName = "Anna university";
			// unable to re-initialize the final variable due to collegeName final keyword used
		fobj.wearId();
		fobj.collegeStartingTime();
		fobj.playGame();
	}
	final void wearId() // final method cannot be override by child class
	{
		System.out.println("Inside the college campus must wear Id card");
	}
	
	final void collegeStartingTime()
	{
		System.out.println("College starting is 9.30 am");
	}
	 void playGame()
	 {
		 System.out.println("you can play any game you like most ");
	 }
	

}
