import java.util.Scanner;
class Sum_of_N_digits
{
public static void main(String [] args )
    {
        Scanner scanObj = new Scanner(System.in);
        System.out.println(" please enter two digit number   ");
        int two_digit = scanObj.nextInt();
        Sum_of_N_digits  sumobj = new Sum_of_N_digits ();
        sumobj.sum_two_digits(two_digit);
        System.out.println(" please enter three digit number   ");
        int three_digit = scanObj.nextInt();
        sumobj.sum_three_digits(three_digit);
        System.out.println(" please enter four digit number   ");
        int four_digit = scanObj.nextInt();
        sumobj.sum_four_digits(four_digit);
    }
void sum_two_digits(int no1)
    {
        int reminder = no1%10; // 10 ==> 0
        int quotient = no1/10; // 1
        System.out.println("Sum of given two digit number is " + (reminder+quotient ) ); 
    }

void sum_three_digits(int no1)
    {
        int reminder1 = no1%10; // 123 ==> 3
        int quotient = no1/10; // 123 ==> 12 
        int reminder2 = quotient%10; // 12 ==> 2
        int reminder3 = quotient/10; // 12 ==> 1
        System.out.println("Sum of given three digit number is " + (reminder1 + reminder2 + reminder3 )); 
    }

void sum_four_digits(int no1)
    {
        int reminder1 = no1%10; //1234 ==> 4
        int quotient = no1/10; // 1234 ==>123
        int reminder2 = quotient%10; // 123 ==> 3
        int quotient1  = quotient/10; // 123 ==> 12 
        int reminder3 = quotient1%10; // 12 ==> 2
        int reminder4 = quotient1/10; // 12 ==> 1 
        System.out.println("Sum of given four digit number is " + (reminder1 + reminder2 + reminder3 + reminder4 ) ); 
    }
}
