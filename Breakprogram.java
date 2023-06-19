package javaprogram;

import java.util.Scanner;

public class Breakprogram {
	public static void main(String[] args) {
		Breakprogram obj = new Breakprogram();
		obj.odd_number();
	}


void odd_number()
{
	Scanner scanobj1 = new Scanner(System.in);	
	System.out.println("Enter number for printing odd number until the given number  ");
	int number  = scanobj1.nextInt();
	int count = 1;	
	while(count<= number)
	{
		if(count==37)
		{
			System.out.println("break at " + count );
			break;
		}
		System.out.print(count + " ");
		count+=2;	
	}
}
}