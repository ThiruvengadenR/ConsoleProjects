package whileloop1;

import java.util.Scanner;

public class Praticeprogram23 {
	public static void main(String[] args) {
		Praticeprogram23 obj23 = new Praticeprogram23();
		//obj23.numOfPower();
		//obj23.neonNumber();
		//obj23.magicNumber();
		//obj23.armstrongNumber();
		//obj23.printingNumberSeries1();
		//obj23.printingNumberSeries2();
		//obj23.printingNumberSeries3();
		//obj23.primeNumberGivenRange();
		//obj23.printingNumberSeries4();
		obj23.printingNumberSeries5();
	}
void printingNumberSeries5()
{
//    1
//    12
//    123
//    1234
//    12345
	Scanner scanObj = new Scanner(System.in);
	System.out.println("Enter your number");
	int num = scanObj.nextInt();
	System.out.println("Enter your row");
	int row = scanObj.nextInt();
	int spec =1 ;
	while(row>0)
	{
	int num1 = num;
	int spec1 = spec;
	while(spec1>0)
	{
		System.out.print(num1);
		spec1--;
		num1++;
	}
    System.out.println();
	spec++;
	row--;
	}
}
void printingNumberSeries4()
{
//	  1
//	  22
//	  333
//	  4444
//	  55555
	Scanner scanObj = new Scanner(System.in);
	System.out.println("Enter your number");
	int num = scanObj.nextInt();
	System.out.println("Enter your row");
	int row = scanObj.nextInt();
	int spec =1 ;
	while(row>0)
	{
		int spec1 = spec;
	while(spec1>0)
	{
		System.out.print(num);
		spec1--;
	}
	System.out.println();
	spec++;
	num++;
	row--;
	}
}
void primeNumberGivenRange()
{ //print all the primes number for the given range
	Scanner scanObj = new Scanner(System.in);
	System.out.println("Enter your  number");
	int num = scanObj.nextInt();
	System.out.println("Enter your max number");
	int max = scanObj.nextInt();
	while(num<=max)
	{
	int count =0;
	int divi= 2;
	while(divi<=num/2)
	{
		if(num%divi==0) {
			count++;
			System.out.println(num + "  is not prime number");
			break;
		}
		divi++;
		//System.out.println("1");
	}
	if(count==0)
	{
		System.out.println(num + " is Prime number");
	}
	System.out.println();
	num++;
	}
}
void printingNumberSeries3()
{
//	11111
//	22222
//	33333
	Scanner scanObj = new Scanner(System.in);
	System.out.println("Enter your number");
	int num = scanObj.nextInt();
	System.out.println("Enter your row");
	int row = scanObj.nextInt();
	System.out.println("Enter your column");
	int column = scanObj.nextInt();
	int numCopy = num;
	while(row>0)
	{
	int count = column;
	while(count>0)
	{
		System.out.print(numCopy + " ");
		count--;
	}
	numCopy = numCopy + 1;
	System.out.println();
	row--;
	}	
}
void printingNumberSeries2()
{
//	12345
//	12345
//	12345
	Scanner scanObj = new Scanner(System.in);
	System.out.println("Enter your number");
	int num = scanObj.nextInt();
	System.out.println("Enter your row");
	int row = scanObj.nextInt();
	System.out.println("Enter your column");
	int column = scanObj.nextInt();
	while(row>0)
	{
	int numCopy = num;
	int count = column;
	while(count>0)
	{
		System.out.print(numCopy + " ");
		numCopy = numCopy + 1;
		count--;
	}
	System.out.println();
	row--;
	}
}
void printingNumberSeries1()
{ 
//	11111
//	11111
//	11111
	Scanner scanObj = new Scanner(System.in);
	System.out.println("Enter your number");
	int num = scanObj.nextInt();
	System.out.println("Enter your row");
	int row = scanObj.nextInt();
	System.out.println("Enter your count");
	int column = scanObj.nextInt();
	while(row>0)
	{
	int count = column;
	while(count>0)
	{
		System.out.print(num + " ");
		count--;
	}
	System.out.println();
	row--;
	}
}
void armstrongNumber()
{ // Given number 153 ==> 1^3 + 5^3 + 3^3 = Derived number 153 
	// Given number == Derived number means Armstrong number 
	Scanner scanObj = new Scanner(System.in);
	System.out.println("Enter your number");
	int num = scanObj.nextInt();
	int numCopy = num;
	int singleNumber ;
	int armStrong = 0;
	while(numCopy>0)
	{
		singleNumber = numCopy%10;
		singleNumber = singleNumber * singleNumber *singleNumber;
		armStrong = armStrong + singleNumber;
		numCopy = numCopy/10;
	}
	if(armStrong==num)
	{
		System.out.println("Given number is a ArmStrong Number");
	}
	else
	{
		System.out.println("Given number is not a ArmStrong Number");
	}
}
void magicNumber() {
//    1. sum of the digits
//    2. reverse the point 1
//    3. product of point 1 and point 2 
//    4. if point 3 == given number it is a magic number.
	Scanner scanObj = new Scanner(System.in);
	System.out.println("Enter your number");
	int num = scanObj.nextInt();
	int numCopy = num;
	int sumOfDigits = 0;
	int rev = 0;
	while(numCopy>0)
	{
		sumOfDigits = sumOfDigits + numCopy%10;
		numCopy = numCopy/10;
	}
	System.out.println(" sum of the digits " + sumOfDigits);
	int sumOfDigitsCopy = sumOfDigits;
	while(sumOfDigitsCopy>0)
	{
		rev = (rev*10) + (sumOfDigitsCopy%10);
		sumOfDigitsCopy = sumOfDigitsCopy/10;
	}
	System.out.println(" reverse number for sumOfDigits " + rev);
	if((sumOfDigits*rev) == num)
	{
		System.out.println(" Given number is magic number ");
	}
	else
	{
		System.out.println(" Given number is not a magic number ");
	}
}
void neonNumber()
{ //1.square of the given number
   // 2.sum of the digits ( for point 1)
  // 3. if sum and given number equal it is neon number.
	Scanner scanObj = new Scanner(System.in);
	System.out.println("Enter your number");
	int num = scanObj.nextInt();
	int square = num*num;
	int sumOfDigits =0;
	while(square>0)
	{
		sumOfDigits = sumOfDigits + square%10;
		square = square/10;
	}
	System.out.println(sumOfDigits);
	if (sumOfDigits == num)
	{
		System.out.println("Given number is Neon number");
	}
	else
	{
		System.out.println("Given number is not a Neon number");
	}
}
void numOfPower()
{
	Scanner scanObj = new Scanner(System.in);
	System.out.println("Enter your base number");
	int num = scanObj.nextInt();
	System.out.println("Enter your power number for base number ");
	int power = scanObj.nextInt();
	int number = 1;
	while(power>0)
	{
		number = number*num;
		power--;
	}
	System.out.println(number);
}
}
