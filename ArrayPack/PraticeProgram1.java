package ArrayPack;

public class PraticeProgram1 {
	int [] thiruMarks= {85,46,87,45,96,53};
	int [] totalmarks = new int[thiruMarks.length];
	
	public static void main (String [] args)
	{
		PraticeProgram1 praticeObj = new PraticeProgram1();
		praticeObj.add();
		praticeObj.printAllEvenNumber();
		praticeObj.printAllOddNumber();
		praticeObj.printAllNumber();
		praticeObj.printAllEvenIndexElement();
		praticeObj.printAllOddIndexElement();
	}
	void printAllOddIndexElement()
	{
		System.out.println("print All Odd Index Element in a array");
		for(int i=0;i<thiruMarks.length;i++)
		{
			if(i%2==1)
			{
				System.out.print(thiruMarks[i]+" ");
			}
		}
		System.out.println();
	}
	void printAllEvenIndexElement()
	{
		System.out.println("print All Even Index Element in a array");
		for(int i=0;i<thiruMarks.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(thiruMarks[i]+" ");
			}
		}
		System.out.println();
	}
	 void printAllNumber() {
		 System.out.println("Print all number in a array");
		for(int i=0;i<thiruMarks.length;i++)
		{
			System.out.print(thiruMarks[i] + " ");
		}
		System.out.println();
		
	}
	 void printAllOddNumber() {
		System.out.println("Print all odd number in the array");
		for(int i=0;i<thiruMarks.length;i++)
		{
			if(thiruMarks[i]%2==1)
			{
				System.out.print(thiruMarks[i] +" ");
			}
		}
		System.out.println();
	}
	void printAllEvenNumber() {
		System.out.println("Print all even number in the array");
		for(int i=0;i<thiruMarks.length;i++)
		{
			if(thiruMarks[i]%2==0)
			{
				System.out.print(thiruMarks[i]+" ");
			}
		}
		System.out.println();
	}
	void add()
	{
		int thiruTotal = 0;
		for(int i =0;i<thiruMarks.length;i++)
		{
			thiruTotal = thiruTotal +thiruMarks[i];
		}
		System.out.println(thiruTotal + " out of 600 marks");
	}

}
