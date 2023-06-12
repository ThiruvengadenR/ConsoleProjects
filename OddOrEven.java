import java.util.Scanner;
class OddOrEven 
{
public static void main(String [] args )
    {
        Scanner scObj = new Scanner (System.in);
        System.out.println("Enter the number ");
        double no1 = scObj.nextDouble();
        OddOrEven  obj = new OddOrEven ();
        obj.check_odd_or_even(no1);
    }
void check_odd_or_even(double no1 )
    {
        String answer = (no1%2==0)? " Given number is Even ": "Given number is Odd ";
        System.out.println(answer);
    }
}
