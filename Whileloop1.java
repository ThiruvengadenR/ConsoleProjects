package javaprogram;

import java.util.Scanner;

public class Whileloop1 
{
public static void main(String[] args)
{
	Whileloop1 loopObj = new Whileloop1();
	//loopObj.exceptNumberInSeries();
	loopObj.missingNumberserious();
	
}

 void missingNumberserious() {
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter the number for content adding in square  ");
		int num = scanObj.nextInt();
		int length =10;
		int count = 0 ;
		int multi ;
		while(count<=length)
		{
			if(count ==3 || count == 7)
			{
				count++;
				System.out.print("__ ");
				continue;
			}
			multi = count+1;
			multi = multi*multi;
			System.out.print((multi+num ) + " ");
			count++;
		}
	
}

void exceptNumberInSeries() 
 {
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = scanObj.nextInt();
		int count =0;
		//int num = 100;
		while(count<=num)
		{
			if(count==30 || count==50)
			{
				count++;
				continue;
			}
			System.out.print (count+ " " );
			count++;
		}
	
}
}
