package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ImplementationOfUserException {
	public static void main(String[] args) {
		ImplementationOfUserException obj = new ImplementationOfUserException();
		obj.SSLCmark(getinputMarks());
	}

	private void SSLCmark(int total) {
		if(total>450)
		{
			System.out.println("your Eligible for Bio-maths , Computer sciences and Accountancy");
		}
		else if (total>400)
		{
			System.out.println("your Eligible for  Computer sciences and Accountancy");
		}
		else
		{
			System.out.println("your Eligible for  Accountancy otherwise praticipate in  Entrances exam ");
		}
		
	}

	private static int getinputMarks() {
		int total =0;
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your tamil mark");
		short tamil = sc.nextShort();
		if(tamil>100 ||tamil<0 )
		{
			throw new  MarksOutOfLimitException ("Your marks should be greater than 0 and less than 100");
		}
		System.out.println("Enter your english mark");
		short english = sc.nextShort();
		if( english>100 || english<0 )
		{
			throw new  MarksOutOfLimitException ("Your marks should be greater than 0 and less than 100");
		}
		System.out.println("Enter your maths mark");
		short maths = sc.nextShort();
		if( maths>100 || maths<0 )
		{
			throw new  MarksOutOfLimitException ("Your marks should be greater than 0 and less than 100");
		}
		System.out.println("Enter your science mark");
		short science = sc.nextShort();
		if( science>100 ||science<0 )
		{
			throw new  MarksOutOfLimitException ("Your marks should be greater than 0 and less than 100");
		}
		System.out.println("Enter your social mark");
		short social = sc.nextShort();
		//total = tamil+english+maths+science+social;
		if( social >100 || social<0 )
		{
			throw new  MarksOutOfLimitException ("Your marks should be greater than 0 and less than 100");
		}
		total = tamil+english+maths+science+social;
		}
		catch(MarksOutOfLimitException e)
		{
			System.out.println(e);
			getinputMarks();
		}
		catch (InputMismatchException e )
		{
			System.out.println(e);
			System.out.println("Input must be in number ");
			getinputMarks();
		}
		return total;
	}

}
