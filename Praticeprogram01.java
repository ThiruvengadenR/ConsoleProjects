

import java.util.Scanner;

public class Praticeprogram01 {

	public static void main(String[] args) {
		Praticeprogram01 obj01 = new Praticeprogram01();
//		obj01.whileFibanocciUntil();
//		obj01.forFibanocciUntil();
//		obj01.whileFibanocciElementsUntil();
//		obj01.forFibanocciElementsUntil();
//		obj01.forFibanocciElementsPrime();
		obj01.whileFibanocciElementsPrime();
	}
	void whileFibanocciElementsPrime()
	{
		// print the prime number which are present in the 25  fibonacci  elements.
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter your number of elements for fibanocci serious While loop ");
		int numElement = sobj.nextInt();
		System.out.println("Enter your starting number for fibanocci serious While loop ");
		int start = sobj.nextInt();
		int first = -1 ;
		int second = 1;
		int sum = start;
		System.out.println("Prime number present in serious");
		int count=1;
		while(count<=numElement)
		{
			int primeCount=0;
			int checkPrime=2;
			while(checkPrime<=sum/2)
			{
				if(sum%checkPrime==0)
				{
					primeCount++;
					break;
				}

				checkPrime++;
			}
			if(sum ==0)
			{
				first = second;
				second = sum;
				sum= first + second;
				count++;
				continue;
			}
			if(primeCount==0)
			{
				System.out.print(sum+ " ");
			}
			first = second;
			second = sum;
			sum= first + second;
			count++;
		}
	}
	void forFibanocciElementsPrime()
	{
		// print the prime number which are present in the 25  fibonacci  elements.
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter your number of elements for fibanocci serious For loop ");
		int numElement = sobj.nextInt();
		System.out.println("Enter your starting number for fibanocci serious For loop ");
		int start = sobj.nextInt();
		int first = -1 ;
		int second = 1;
		int sum = start;
		System.out.println("Prime number present in serious");
		for(int count =1 ; count<=numElement; count++)
		{
			int primecount=0;
			for(int checkPrime =2;checkPrime<=sum/2; checkPrime++)
			{
				if(sum%checkPrime==0)
				{
					primecount++;
					break;
				}
				else if(sum ==0)
				{
					primecount++;
					break;
				}
			}
			
			if(primecount==0)
			{
				System.out.print(sum+ " ");
			}
			first = second;
			second = sum;
			sum= first + second;
			
		}
	}
	void whileFibanocciElementsUntil()
	{
		// print 25 fibonacci elements.
		//  print the sum of 25 fibonacci elements.
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter your number of elements for fibanocci serious while loop ");
		int numElement = sobj.nextInt();
		System.out.println("Enter your starting number for fibanocci serious while loop ");
		int start = sobj.nextInt();
		int first = -1 ;
		int second = 1;
		int sum = start;
		int count =1 ;
		long total =0;
		while(count<=numElement)
		{
			System.out.print(sum + " ");
			total = total +sum;
			first  = second ;
			second = sum ;
			sum = first+ second;
			count++;
		}
		System.out.println();
		System.out.println("sum of the total Elements " + total);
	}
	void forFibanocciElementsUntil()
	{
		//print 25 fibonacci elements
		//  print the sum of 25 fibonacci elements.
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter your number of elements for fibanocci serious For loop ");
		int numElement = sobj.nextInt();
		System.out.println("Enter your starting number for fibanocci serious For loop ");
		int start = sobj.nextInt();
		int first = -1 ;
		int second = 1;
		int sum = start;
		long total = 0 ;
		for(int count=1;count<=numElement;count++)
		{
			System.out.print(sum + " ");
			total = total + sum ;
			first  = second ;
			second = sum ;
			sum = first+ second;
		}
		System.out.println();
		System.out.println("Sum of the Elements in this serious is " + total);
	}
	void forFibanocciUntil()
	{
		//	 print all the fibonacci series until range.
		//print the sum of the fibonacci series until range
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter your range for fibanocci serious For loop ");
		int range = sobj.nextInt();
		System.out.println("Enter your starting number for fibanocci serious For loop ");
		int start = sobj.nextInt();
		int first = -1;
		int second =1;
		long total =0;
		for(int sum=start;sum<=range;sum=first+second)
		{
			first = second;
			second = sum;
			System.out.print(sum +" ");
			total = total + sum ;
		}
		System.out.println();
		System.out.println("Sum of the Elements in this serious is " + total);
	}
	void whileFibanocciUntil()
	{
		//	 print all the fibonacci series until range.
		//   print the sum of the fibonacci series until range
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter your range for fibanocci serious ");
		int range = sobj.nextInt();
		int first = -1;
		int second =1;
		int sum=0;
		long total =0;
		while(sum<=range)
		{

			System.out.print( sum +" ");
			first = second;
			second = sum;
			total = total + sum ;
			sum = first + second;
			
		}
		System.out.println();
		System.out.println("Sum of the Elements in this serious is " + total);
	}

}
