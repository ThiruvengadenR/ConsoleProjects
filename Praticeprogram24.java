package whileloop1;

import java.util.Scanner;

public class Praticeprogram24 {

	public static void main(String[] args) {
		Praticeprogram24 obj24 = new Praticeprogram24();
		//obj24.FactorialOfGivenNumber();
		//obj24.squareOfTheNumberSerious();
		//obj24.specialSerious1();
		//obj24.specialSerious2();
		obj24.printPrimeNumberNot();

	}
	void printPrimeNumberNot()
	{
		//print non prime numbers from 1 to 100
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter your Starting number");
		int start = scanObj.nextInt();
		System.out.println("Enter your Ending number");
		int end = scanObj.nextInt();
		System.out.println("print non prime numbers from " + start + "to" + end );
		while(start<=end)
		{
			boolean flag = false;
			int divi =2;
			while(divi<=start/2)
			{
				if(start%divi==0)
				{
					flag = true;
					break;
				}
				divi++;
			}
			if(flag==true)
			{
				System.out.print(start + " ");
			}
			start++;
		}
	}
	void specialSerious2()
	{
		// 1*10= 10 , 2*9 = 18 , 3*8 = 24,4*7 = 28 ,    5*6 = 30
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter your Starting number");
		int start = scanObj.nextInt();
		System.out.println("Enter your Ending number");
		int end = scanObj.nextInt();
		int endCopy = end;
		int product;
		while(start<end)
		{
			product = start * endCopy;
			System.out.print(product + " ");
			start++;
			endCopy--;
		} 
					}
	void specialSerious1()
	{
//		1000,81,512, 49, 216, 25, 64, 9,8,1
//	    10^3,9^2,8^3,7^2,6^3,5^2,4^3,3^2,2^3,1^2
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter your Maxium number");
		int max = scanObj.nextInt();
		int start = 1;
		while(start<=max)
		{
			int startCopy = start;
			if(startCopy%2==0)
			{
				startCopy = startCopy*startCopy*startCopy;
				System.out.print(startCopy + " ");
				start++;
				continue;
			}
			if(startCopy%2!=0)
			{
				startCopy = startCopy*startCopy;
				System.out.print(startCopy+ " ");
				start++;
				
			}
		}
	}
	void squareOfTheNumberSerious()
	{
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter your Maxium number");
		int max = scanObj.nextInt();
		int start = 1;
		while(start<=max)
		{
			System.out.print((start*start)+ " ");
			start++;
		}
	}
	void FactorialOfGivenNumber()
	{ //Factorial of the given number.
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scanObj.nextInt();
		int product = 1;
		while(num>0)
		{
			product = product*num;
			num--;
		}
		System.out.println(product);
	}

}
