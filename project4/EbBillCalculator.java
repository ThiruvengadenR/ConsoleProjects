package project4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EbBillCalculator {
	private int EbNo;
	private int PerivousMonthReading;
	private int CurrentMonthReading;
	int countGetinput =0;
	int countPerviousMonth =0;
	int countCurrentMonth=0;
	
	public static void main(String[] args) throws OverTryException {
		EbBillCalculator obj = new EbBillCalculator();
		obj.getMeterNumber();
		obj.getDistrictNameOftheCustomer(obj.EbNo);
		obj.getPerviousMonthReading();
		obj.getCurrentMonthReading(obj.PerivousMonthReading);
		int consumedUnit = obj.calculateEbBill(obj.PerivousMonthReading,obj.CurrentMonthReading);
		obj.homeUseEbCalculate(consumedUnit);
	}


	private void homeUseEbCalculate(int consumedUnit) {
		if(consumedUnit<=100)
		{
			System.out.println("Consumed units--> " + consumedUnit );
			System.out.println("You don't pay any amount ");
		}
		else if(consumedUnit>100 && consumedUnit<=200)
		{
			System.out.println("Consumed units--> " + consumedUnit);
			float price = (float) ((consumedUnit-100)*2.25);
			System.out.println("You have to pay " +((consumedUnit-100)*1.50));
		}
		else if(consumedUnit>200 && consumedUnit<=400)
		{
			System.out.println("Consumed units--> " + consumedUnit);
			float price = (float) ((100)*2.25 + (consumedUnit-200)*4.50);
			System.out.println("You have to pay " + price );
		}
		else if(consumedUnit>400 && consumedUnit<=500)
		{
			System.out.println("Consumed units--> " + consumedUnit);
			float price = (float) ((100)*2.25 + (200)*4.50 + (consumedUnit-400)*6.00);
			System.out.println("You have to pay " + price );
		}
		else if(consumedUnit>500)
		{
			System.out.println("Consumed units--> " + consumedUnit);
			if(consumedUnit>500 && consumedUnit<=600)
			{
				float price = (float) ((300)*4.50 + (100)*6.0 +(consumedUnit-500)*8);
				System.out.println("You have to pay " + price);
			}
			else if(consumedUnit>600 && consumedUnit<=800)
			{
				float price = (float) ((300)*4.50 + (100)*6.0 +(100)*8 + (consumedUnit-600)*9.0);
				System.out.println("You have to pay " + price);
			}
			else if(consumedUnit>800 && consumedUnit<=1000)
			{
				float price = (float) ((300)*4.50 + (100)*6.0 +(100)*8 + (200)*9.0 +(consumedUnit-800)*10.0);
				System.out.println("You have to pay " + price);
			}
			else if(consumedUnit>1000)
			{
				float price = (float) ((300)*4.50 + (100)*6.0 +(100)*8 + (200)*9.0 +(200)*10.0 + (consumedUnit-1000)*11.0);
				System.out.println("You have to pay " + price);
			}
			float price = (float) ((100)*3.50 + (300)*4.60 +(consumedUnit-500)*6.60)+50;
			System.out.println("You have to pay " + price);
		}
	}

	private int calculateEbBill(int perivousMonthReading, int currentMonthReading) {
		int consumedUnit = currentMonthReading-perivousMonthReading;
		return consumedUnit;
	}

	private void getCurrentMonthReading(int PerivousMonthReading) throws OverTryException {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your current month Eb reading ");
		try {
			CurrentMonthReading = obj.nextInt();
		}
		catch(InputMismatchException e)
		{
			countCurrentMonth++;
			if(countCurrentMonth>3)
			{
				throw new OverTryException("Maximum limit for wrong input is 3 Try again later");
			}
			else
			{
				System.out.println(e);
				getCurrentMonthReading( PerivousMonthReading);
			}
		}
		if(PerivousMonthReading > CurrentMonthReading)
		{
			System.out.println(" Current month reading is less than pervious mouth reading ");
			getCurrentMonthReading(PerivousMonthReading);
			countCurrentMonth++;
			if(countCurrentMonth>3)
			{
				throw new OverTryException("Maximum limit for wrong input is 3 Try again later");
			}
		}
	}

	private void getPerviousMonthReading() throws OverTryException {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your pervious month Eb reading ");
		try {
			PerivousMonthReading = obj.nextInt();
		}
		catch(InputMismatchException e)
		{
			countPerviousMonth++;
			if(countPerviousMonth>3)
			{
				throw new OverTryException("Maximum limit for wrong input is 3 Try again later");
			}
			else
			{
				System.out.println(e);
				getPerviousMonthReading();
			}
		}
	}
	
	private void getDistrictNameOftheCustomer(int EbNo) {
		String number = new String();
		number=number.valueOf(EbNo);
		 //System.out.println(number);
		CharSequence refer = number;
		refer = refer.subSequence(0, 2);
		//System.out.println(refer);
		number = (String) refer ;
		int index = Integer.valueOf(number);
		int index1 = (index<=69)? index/3:index/2;
		//System.out.println();
		String [] array = { "Ariyalur","Chengalpattu","Chennai","Coimbatore","Cuddalore","Dharmapuri","Dindigul","Erode","Kallakurichi","Kanchipuram","Nagercoil","Karur","Krishnagiri","Madurai","Mayiladuthurai","Nagapattinam","Namakkal","Ooty","Perambalur","Pudukkottai","Ramanathapuram"," Ranipet","Salem","Sivagangai","Tenkasi","Thanjavur","Theni","Thoothukudi","Tiruchirappalli","Tirunelveli"," Tirupattur","Tiruppur","Tiruvallur","Tiruvannamalai","Thiruvarur","Vellore","Viluppuram","Virudhunagar" };
		System.out.println("You  are from the "+ array[index1-1] + " district");
	}
	
	private void getMeterNumber() throws OverTryException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Eb number ");
		try
		{
			 EbNo =  sc.nextInt();
			 if(EbNo<=99999999)
			 {
				 throw new CusomerNoNotInRangeException("Please Check Customer Id once Again (min-9 digits) ");
			 }
		}
		catch(InputMismatchException e)
		{
			countGetinput++;
			if(countGetinput>3) {
			throw new OverTryException("Maximum limit for wrong input is 3 Try again later");
			}
			else {
			System.out.println(" Please Enter your EB-9 digit number (only number are allowed) ");
			getMeterNumber();
			}
		}
		catch (CusomerNoNotInRangeException e) {
			countGetinput++;
			if(countGetinput>3) {
			throw new OverTryException("Maximum limit for wrong input is 3 Try again later");
			}
			else
			{
				System.out.println(e);
				getMeterNumber();
			}
		}
	}
}
