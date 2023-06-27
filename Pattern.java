package PatternProgram;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Pattern objPattern = new Pattern();
		//objPattern.SquareFillPattern();
		//objPattern.reverseRightHalfPyramid();
		//objPattern.squareHollowPattern();
		//objPattern.rightPascalTriangle();
		//objPattern.leftHalfPyramid();
	}
	void leftHalfPyramid()
	{
		Scanner objscan = new Scanner(System.in);
		System.out.println("Enter you Number ");
		int num = objscan.nextInt();
		int colum = num;
		int count =1;
		while(colum>0)
		{
		int row = num;
		int count1 = count;
		while(row>0)
		{
			if(count1<num)
			{
			System.out.print("  ");
			}
			else
			{
			System.out.print("* ");	
			}
			count1++;
			row--;
		}
		System.out.println();
		colum--;
		count++;
		}
	}
	
	void rightPascalTriangle()
	{
		Scanner objscan = new Scanner(System.in);
		System.out.println("Enter you Number ");
		int num = objscan.nextInt();
		int num1 = num;
		int row =1;
		int row1 = num-1;
		while(num1>0)
		{
		int count = row;
		while(count>0)
		{
			if(count%2!=0)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
			count--;
		}
		System.out.println();
		num1--;
		row++;
		}
		
		while(num1<num)
		{
		int count = row1;
		while(count>0)
		{
			if(count%2!=0)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
			count--;
		}
		System.out.println();
		num1++;
		row1--;
		}
		

	}
	void squareHollowPattern() 
	{
		Scanner objscan = new Scanner(System.in);
		System.out.println("Enter you Number ");
		int num = objscan.nextInt();
		int top1 = num;
		int midcount = num;
		while(top1==num || top1==1)
		{
		int top = num;
		while(top>0)
		{
			System.out.print("* ");
			top--;
		}
		System.out.println();
//		int midcount = num;
		while((midcount-2)>0)
		{
		int star = num; // mid
		while(star>0)
		{
			if(star== num || star == 1)
			{
				System.out.print("* " );
			}
			else
			System.out.print("  " );
			star--;
		}
		System.out.println();
		midcount--;
		}
	//	System.out.println();
		top1 = top1-(num-1);
		}
	}
    void SquareFillPattern() 
	{
		Scanner objscan = new Scanner(System.in);
		System.out.println("Enter you Number ");
		int star = objscan.nextInt();
		int row = star;
		while(row>0)
		{
		int star1 = star;
		while(star1>0)
		{
			System.out.print("*" + " ");
			star1--;
		}
		System.out.println();
		row--;
		}
		
	}
	void reverseRightHalfPyramid()
	{
		Scanner objscan = new Scanner(System.in);
		System.out.println("Enter you Number ");
		int star = objscan.nextInt();
		
		while(star>0)
		{
		int star1 = star;
		while(star1>0)
		{
			System.out.print("*" + " ");
			star1--;
		}
		System.out.println();
		star--;
		}
	}

}
