package whileloop1;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		Lcm obj = new Lcm();
		//obj.twoNumberLcm();
		obj.threeNumberLcm();

	}
	void threeNumberLcm()
	{
		Scanner Sobj = new Scanner(System.in);
		System.out.println("Enter your First Number ");
		int num1 = Sobj.nextInt();
		System.out.println("Enter your Second Number ");
		int num2 = Sobj.nextInt();
		System.out.println("Enter your Second Number ");
		int num3 = Sobj.nextInt();
		int firstBig =0 ;
		int secondBig = 0;
		int thirdBig = 0;
		if(num1>num2 && num1>num3)
		{
			firstBig = num1;
			if(num2>num3)
			{
				secondBig = num2;
				thirdBig = num3;
			}
			else
			{
				secondBig = num3;
				thirdBig = num2;
			}
		}
		if(num2>num1 && num2>num3)
		{
			firstBig = num2;
			if(num1>num3)
			{
				secondBig = num1;
				thirdBig = num3;
			}
			else
			{
				secondBig = num3;
				thirdBig = num1;
			}
		}
		if(num3>num1 && num3>num2)
		{
			firstBig = num3;
			if(num1>num2)
			{
				secondBig = num1;
				thirdBig = num2;
			}
			else
			{
				secondBig = num2;
				thirdBig = num1;
			}
		}
		System.out.println("First Big number " + firstBig);
		System.out.println("Second Big number " + secondBig);
		System.out.println("Third Big number " + thirdBig);
		int secondBigCopy = secondBig;
		int thirdBigCopy = thirdBig;
		int firstBigCopy = firstBig;
		boolean flag = false;
		while(flag==false)
		{
		while(firstBig>=secondBig && firstBig>=thirdBig)
		{
			if(firstBig ==secondBig && secondBig==thirdBig)
			{
				System.out.println("Least common mutiples of given three number is " + firstBig);
				flag = true;
				break;
			}
			secondBig = secondBig + secondBigCopy;
			//thirdBig = thirdBig + thirdBigCopy;
			while(secondBig>thirdBig)
			{
				thirdBig = thirdBig + thirdBigCopy;
			}
		}
		firstBig = firstBig + firstBigCopy;
		}
	}
	void twoNumberLcm()
	{
		Scanner Sobj = new Scanner(System.in);
		System.out.println("Enter your First Number ");
		int num1 = Sobj.nextInt();
		System.out.println("Enter your Second Number ");
		int num2 = Sobj.nextInt();
		int big,small;
		if(num1>num2)
		{
			big = num1;
			small = num2;
		}
		else
		{
			big = num2;
			small = num1;
		}
		System.out.println(" Bigger number is " + big);
		System.out.println(" Smaller number is " + small);
		int smallcopy = small;
		int bigcopy = big;
		int count =1;
		while(count>0)
		{
			while(big>=small)
			{
				if(big == small)
				{
					System.out.println("Least common mutiples of given two numbers" + small);
					count--;
					break;
				}
				small=small+smallcopy;
			}
			big = big+bigcopy;
		}
	}

}
