package whileloop1;

class Practiceprogram20 {
	public static void main(String[] args) {
		//Praticeprogram20 obj = new Praticeprogram20();
		Practiceprogram20 obj = new Practiceprogram20();
		//obj.serious1();
		//obj.even();
		//obj.printing11();
		//obj.sumOfFirstEven();
		//obj.sumOfLastEven();
		//obj.sumOfRangeAndDivisible();
		obj.sumOfDigits();
	}
void sumOfDigits()
{
	//Print the number of digits for the given number.
	//( for +ve and -ve numbers)
	long givenNumber = 446646546463230l;
	int digits = 0;
	if(givenNumber>=0)
	{
	while(givenNumber>0)
	{
		digits++;
		givenNumber = givenNumber/10;
	}
	System.out.println("Number of digits in given number " + digits);
	}
	else
	{
		while(givenNumber<0)
		{
			digits++;
			givenNumber = givenNumber/10;
		}
		System.out.println("Number of digits in given number " + digits);
	}
}
void sumOfRangeAndDivisible()
{
	//Print the sum of the numbers from 1 - 50 which are  
	//divisible by 4 and divisible by 6;
	int min = 1, max=50,sum=0;
	System.out.println("sum of number from 1 to 50 which are divisible 4 and 6 ");
	while(min<=max)
	{
		if(min%4==0 && min%6==0) {
			sum = sum+min;
			//System.out.println(min);
		}
		min++;
	}
	System.out.println(sum);
}
void sumOfLastEven()
{
	// Print the sum of the last 5 even numbers from 50
	int maxCount = 4;
	int minCount = 0;
	int number = 50;
	int sum = 0;
	System.out.println("Print the sum of the last 5 even numbers from 50");
	while (minCount<=maxCount)
	{
		sum = sum + number;
		minCount++;
		number-=2;
	}
	System.out.println(sum);
	
}
void sumOfFirstEven()
{
	int maxcount = 8;
	int count =0;
	int num = 0;
	System.out.println("Sum of N even numbers ");
	while(count<=maxcount)
	{
		num = num + (count* 2);
		count++;
	}
	System.out.println(num);
}
void printing11()
{
//	 print the numbers from 100 -1000 which are divisible by 11 
//	 but the value should be greater than 450.
	int max = 1000;
	int min = 450;
	System.out.println("Divisibe of 11 greater than 450 and lesser tham 1000");
	while(min<=max)
	{
		if(min%11==0)
		{
			System.out.print(min + " ");
		}
		min++;
	}
}
void even()
{
	//print even number from 100 to 50; 
	//100, 98,96....50
	int max =100;
	int min = 50;
	System.out.println("print even number from 100 to 50");
	while(max>=min)
	{
		System.out.print(max + " ");
		max-=2;
	}
}
void serious1()
{
	//print the number from 1 to 100 which are divisible 
	//by 2 and not divisible by 3 and 5;
	int max = 100;
	int min = 1;
	System.out.println("print the number from 1 to 100 by divided 2 and not divisible by 3 and 5");

	while(min<=max)
	{
		if( min%3!=0 && min%5 !=0 )
		{
			if(min%2==0)
				System.out.print( min + " ");
			
		}
		min++;
	}
}
}
