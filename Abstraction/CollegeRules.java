package Abstraction;

public abstract  class CollegeRules
	{
		final static int speed = 50;
		String greenSignal = "Cross the road ";
		
//		CollegeRules()
//		{
//			System.out.println("i am default constructor ");
//		}
//		
//		static CollegeRules absObj = new CollegeRules();
		
		private int collegeTime =9;
		public  int getCollegeTime() {
			return collegeTime;
		}

		public void setCollegeTime(int collegeTime) {
			this.collegeTime = collegeTime;
			System.out.println("College time successfully resetted");
		}

		static 
		{
			System.out.println("welcome you all ");
		}
		
		static void uniform()
		{
			System.out.println("monday and friday lap uniform must ");
		}
		
		final void license()
		{
			System.out.println("Person must have license to park the bike inside the college campus");
		}
		
		abstract void Examdate();
		abstract void fine();
	}
