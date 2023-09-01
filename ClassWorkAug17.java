package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ClassWorkAug17 {
	//static int [] array = new array[]
	static double start;
	static double end;
	static double increment;
	
	public static void main(String[] args) {
		ClassWorkAug17 obj = new ClassWorkAug17();
		//obj.createNewList(true);
		obj.sumOfTheValuesInTheList();
		//obj.averageValue();
		//obj.printGreaterThanTheAverageValue();
	}

	private void printGreaterThanTheAverageValue(ArrayList al, double avg) {
		int num =0;
		int size = al.size();
		System.out.print("Printing average number in the list [ ");
		while(num<size)
		{
			if((double)(al.get(num))>=avg)
			{
				System.out.print((double)al.get(num)+" ");
			}
			num++;
		}
		System.out.println("]");
		
	}


	private double averageValue(ArrayList al) {
		double sum = getSumOfTheList( al);
		int size = al.size();
		double avg = sum/size;
		return avg;
		
	}

	private void getMaxAndMin(ArrayList al) {
	//	ListIterator il = al.listIterator();
		System.out.println("Maximum value in the list " + Collections.max(al));
		System.out.println("Minimum value in the list " + Collections.min(al));
		
		System.out.println("Alternate method ");
		int num =0;
		int size = ((int)al.size());
		//double temp = 0.0;
		double max = (double)al.get(0);
		while(num<size)
		{
			if(max<(double)al.get(num))
			{
				max = (double)al.get(num);
			}
			num++;
		}
		System.out.println("Maxium number in the list " + max);
	}

	private void sumOfTheValuesInTheList() {
		System.out.println("Create a list containing double values, find the sum of the values in the list");
		ArrayList al = createNewList(false);
		getSumOfTheList(al);
		getMaxAndMin(al);
		double avg = averageValue(al);
		printGreaterThanTheAverageValue(al,avg);
	}


	private double getSumOfTheList(ArrayList al) {
		int num =0 ;
		int size = al.size();
		double sum =0;
		while(num<size)
		{
			sum = sum +(double)(al.get(num));
			num++;
		}
		System.out.println("Sum of the Number in the list " + sum );
		return sum;
	}

	private void getInput() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your Starting number of the list ");
		start = sc.nextDouble();
		System.out.println("Enter your last  number of the list ");
		end  = sc.nextDouble();
		System.out.println("Enter the increment value between the two numbers ");
		increment = sc.nextDouble();
	}

	private ArrayList createNewList(boolean t) {
		ArrayList al = new ArrayList();
		getInput();
		double value = start;
		while(value<end)
		{
			al.add(value);
			value = value + increment;
		}
		System.out.println(al);
		if(t)
		{
			getOddNumber(al);
			getEvenNumber(al);
		}
		return al;
	}

	private void getOddNumber(ArrayList al) {
		int num =0;
		System.out.print("Enter the Odd number in the list [ " );
		while(num<al.size())
		{
			if((int)(al.get(num))%2==0)
			{
				System.out.print( al.get(num) +" ");
			}
			num++;
		}
		System.out.println("]");
	}

	private void getEvenNumber(ArrayList al) {
		int num =0;
		System.out.print("Enter the Even number in the list [ " );
		while(num<al.size())
		{
			if((int)(al.get(num))%2==1)
			{
				System.out.print( al.get(num) +" ");
			}
			num++;
		}
		System.out.println("]");
	}
}
