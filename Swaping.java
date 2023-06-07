import java.util.Scanner;
class Swaping
{
    public static void main (String [] args )
{
Scanner scan_obj = new Scanner(System.in);
System.out.println("Enter your first number ");
Double num1 = scan_obj.nextDouble(); 
System.out.println("Enter your second number ");
Double num2 = scan_obj.nextDouble(); 
Swaping swap_obj = new Swaping();
swap_obj.twoSwap(num1 , num2);
}
void twoSwap(Double a , Double b)
{
Double no1 = a;
Double no2 = b;
System.out.println("before sweaping ");
System.out.println("no1  =  " + no1 );
System.out.println("no2  =  " + no2 );
Double temp = no1;
no1 = no2;
no2 = temp;
System.out.println("after sweaping ");
System.out.println("no1  =  "  + no1 );
System.out.println("no2  =  " +  no2 );
}
}

