package whileloop1;

import java.util.Scanner;

public class Practiceprogram21 {
	public static void main(String[] args) {
		Practiceprogram21 obj21 = new Practiceprogram21();
		//obj21.sumOfDigits();
		//obj21.sumOfDigitsUntil_ones();
		//obj21.productOfDigits();
		//obj21.reverseOfGivenNumber
		obj21.palindrome();
}
	void palindrome()
	{
		// check whether the given number is palindrome or not.
		//Eg: 121  == 121 palindrom
		//123 == 321 not a palindrom
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = scanObj.nextInt();
		int copy = num;
		int reverse = 0;
		while(copy>0)
		{
			reverse = reverse*10 + copy%10;
			copy = copy/10;
		}
		if(num==reverse)
		{
			System.out.println("Given number is a palindrom" );
			System.out.println("Given number " + num + " Reverse number" + reverse);
		}
		else
		{
			System.out.println("Given number is not a palindrom" );
			System.out.println("Given number " + num + "and  Reverse number " + reverse);
		}
	}
	void reverseOfGivenNumber()
	{
		//reversing the given number.
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = scanObj.nextInt();
		int copy = num;
		int reverse = 0;
		while(copy>0)
		{
			reverse = reverse*10 + copy%10;
			copy = copy/10;
		}
		System.out.println("Reversing the given number " + reverse);
		
	}
	void productOfDigits()
	{
		//product of the digits.
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = scanObj.nextInt();
		int productOfDigits =1;
		while(num>0 || num<0)
		{
			productOfDigits = productOfDigits * (num%10);
			num = num/10;
			//System.out.println("try "+ productOfDigits);
		}

		System.out.println("Product of the digits in given number " + productOfDigits);
	}
	void sumOfDigitsUntil_ones()
	{
		//sum of the digits, if the sum is more than 9 then sum the result also.
		//( sum of the digits until it become a single digit).
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = scanObj.nextInt();
		int sumDigits =0;
		int newSum =0;
		while(num>0)
		{
			sumDigits = sumDigits + num%10;
			num = num/10;
		}
		while(num<0)
		{
			sumDigits = sumDigits + -1*(num%10);
			num = num/10;
		}
		System.out.println("try "+ sumDigits);
		if(sumDigits>9)
		{
			while(sumDigits>0)
			{
				newSum = newSum + sumDigits%10;
				sumDigits = sumDigits/10;
			}
			System.out.println("Sum of the number until unit digit " + newSum);
		}
		else
		{
			System.out.println("Sum of the number until unit digit " + sumDigits);
		}
		
	}
	void sumOfDigits()
	{
		//sum of the digits for the given number.( using loop)
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = scanObj.nextInt();
		int sumDigits =0;
		while(num>0)
		{
			sumDigits = sumDigits + num%10;
			num = num/10;
		}
		while(num<0)
		{
			sumDigits = sumDigits + -1*(num%10);
			num = num/10;
		}
		System.out.println("sum of the digits in given number " + sumDigits);
	}
}
