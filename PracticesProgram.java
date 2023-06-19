package javaprogram;

import java.util.Scanner;

public class PracticesProgram {
	public static void main(String[] args) {
		PracticesProgram practObj = new PracticesProgram();
		//practObj.primenumber();
		practObj.fibonacci();
	}
void fibonacci()
{
	Scanner scanObj = new Scanner(System.in);
	System.out.println("Enter the number ");
	int num = scanObj.nextInt();
	int start = 1;
	while(start<=num)
	{
		//if(start==)
		System.out.print(start + " ");
		start= start+start;
	}
	
}
void primenumber()
{
	Scanner scanObj = new Scanner(System.in);
	System.out.println("Enter the number ");
	int num = scanObj.nextInt();
	int start = 2;
	int count = 0;
	while(start<=num/2)
	{
		while(num%start==0)
		{
			System.out.println(start);
			count++;
			start++;
		}
		start++;
	}
	//System.out.println(count);
	if(count==0)
	{
		System.out.println("Given number is prime");
	}
	else
	{
		System.out.println("Given number is not prime");
	}
	
	
}
}