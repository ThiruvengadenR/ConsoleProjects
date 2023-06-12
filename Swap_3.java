import java.util.Scanner;
class Swap_3
{
public static void main (String [] args )
    {
        Scanner scanObj = new Scanner (System.in);
        System.out.println("Enter your first number ");
        double no1 = scanObj.nextDouble();
        System.out.println("Enter your Second number ");
        double no2 = scanObj.nextDouble();
        Swap_3 swapObj = new Swap_3();
        swapObj.twoNum(no1 , no2);
    }
void twoNum(double no1 , double no2)
    {
        double first = no1;
        double second = no2;
        System.out.println("before swaping two numbers  ");
        System.out.println(" no1 =  " + first );
        System.out.println(" no2 =   " + second );
        first = no1 + no2 ; // 10 + 5 = 15
        second = first - second ; // 15 -5 = 10
        first = first - second ; // 10 - 5 = 5
        //first = (first<0)? first*(-1):first ; // ternary operator 
        System.out.println("after swaping two numbers  ");
        System.out.println(" no1 =  " + first );
        System.out.println(" no2 =   " + second );
    }
}


