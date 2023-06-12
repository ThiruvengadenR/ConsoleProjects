import java.util.Scanner;
class Last_Digit_Program
{
public static void main (String [] args )
    {
        Scanner scObj = new Scanner (System.in);
        System.out.println("Enter the number ");
        double no1 = scObj.nextDouble();
        Last_Digit_Program lastObj = new Last_Digit_Program ();
        lastObj.two_digit(no1);
        lastObj.three_digit(no1);
    }
void two_digit( double no1)
    {
        double lastTwo = (no1%100);
        System.out.println(" Last 2 digit of the given number is " + lastTwo);
    }
void three_digit(double no1)
    {
        String check = (no1/100 >= 1)?  " Given number is eligible for finding last three digit " : "Given number is not eligible for finding last three digit" ;
        System.out.println(check);
        double lastThree = (no1%1000);
        System.out.println(" Last 3 digit of the given number is " + lastThree);
    }
}

