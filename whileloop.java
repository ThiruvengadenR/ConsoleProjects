package javaprogram;
import java.util.Scanner;
public class whileloop {
	public static void main (String [] args )
	{
		whileloop obj = new whileloop();
		//obj.printingName();
		//obj.n_Natural_numbers();
		//obj.even_number();
		//obj.odd_number();
		obj.tables();
	}
void tables()
{
	Scanner scanobj1 = new Scanner(System.in);	
	System.out.println("Enter the tables number you want  ");
	int tableNo  = scanobj1.nextInt();
	int temp = tableNo;
	System.out.println("Enter the number for printing multiples of tables until the given number  ");
	int max  = scanobj1.nextInt();
	while(tableNo <= max)
	{
		System.out.print(tableNo + " ");
		tableNo+=temp;
	}
	
	
}
void odd_number()
{
	Scanner scanobj1 = new Scanner(System.in);	
	System.out.println("Enter number for printing odd number until the given number  ");
	int number  = scanobj1.nextInt();
	int count = 1;	
	while(count<= number)
	{
		System.out.print(count + " ");
		count+=2;	
	}
}
void even_number()
{
	Scanner scanobj1 = new Scanner(System.in);	
	System.out.println("Enter number for printing even number until the given number  ");
	int number  = scanobj1.nextInt();
	int count = 0 ;	
	while(count<= number)
	{
		if(count%2 ==0) {
		System.out.print(count + " ");
		}
		count++;
		
	}
	
	
}
void n_Natural_numbers()
{
	Scanner scanobj1 = new Scanner(System.in);	
	System.out.println("Enter number for printing n Natural number ");
	int number  = scanobj1.nextInt();
	int count = 0 ;
	while (count<=number)
	{
		System.out.print(count + " " );
		count++;
	}
}
void printingName()
{
	Scanner scanobj = new Scanner(System.in);
	System.out.println("Enter your name ");
	String name  = scanobj.nextLine();
	System.out.println("Enter number of time to print your name  ");
	int number  = scanobj.nextInt();
	int count = 0;
	while(count<=number)
	{
		System.out.println(name );
		count++;
	}
	
}
}
