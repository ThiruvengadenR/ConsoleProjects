import java.util.Scanner;
class Calculator
{
public static void main (String [] args )
{
Scanner scanObj = new Scanner(System.in);
System.out.println("Please Enter your name   ");
String customerName = scanObj.next();
System.out.println("Hi  "+ customerName + " welcome to class Calulator  ");
System.out.println("***POINT TO REMEMBER This class contain Addition  of two number with Substraction of two number*** ");
System.out.println("### Addition ###");
System.out.println("Enter your first number to add   ");
float no1 = scanObj.nextFloat();
System.out.println("Enter your second number to add   ");
float no2 = scanObj.nextFloat();
Calculator calObj = new Calculator ();
calObj.addition(no1,no2);
System.out.println("### Substraction ### ");
System.out.println("Enter your first number to add   ");
float no3 = scanObj.nextFloat();		
System.out.println("Enter your second number to add   ");
double no4 = scanObj.nextDouble();
calObj.sub(no3,no4);
}
void addition(double no1,double no2)
{
System.out.println("sum of two given number is    " + (no1+no2));
}
void sub(double no1,double no2)
{
System.out.println("sum of two given number is    " + (no1-no2));
}
}
