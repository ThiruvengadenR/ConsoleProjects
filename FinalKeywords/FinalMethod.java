package FinalKeywords;

public class FinalMethod {

final void add (int a , int b)
{
	int c = a+b;
	System.out.println("Sum of the two variables "+c);
}
}

class FinalMethodCheck extends FinalMethod
{
//	void add(int a,int b)
//	{
//		int c = a-b;
//		System.out.println("Sum of the two variables "+c);
//	}
	public static void main(String[] args) {
		FinalMethodCheck checkObj = new FinalMethodCheck();
		checkObj.add(2,3);
	}
}
