import java.util.Scanner;
class Find_Digit_number
{
public static void main (String [] args )
    {
        Scanner scObj = new Scanner (System.in);
        System.out.println("Enter the number ");
        double no1 = scObj.nextDouble();
        Find_Digit_number findObj = new Find_Digit_number();
        findObj.unit_digit(no1);
        findObj.tens_digit(no1);
        findObj.hundreds_digit(no1);
        findObj.thousands_digit(no1);
    }
void unit_digit(double no1 )
    {
        double number = (no1%10);
        System.out.println(" Number of onces in given number  " + (int) number );
    }

void tens_digit(double no1 )
    {
        double number = (no1/10);
        System.out.println(" Number of tens in given number " + (int) number );
    }

void  hundreds_digit(double no1 )
    {
        double number = (no1/100);
        System.out.println(" Number of hundreds in given number " + (int) number );
    }

void thousands_digit(double no1 )
    {
        double number = (no1/1000);
        System.out.println(" Number of thousands  in given number " + (int) number );
    }

}
