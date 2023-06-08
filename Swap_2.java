import java.util.Scanner;
class Swap_2 
{
public static void main (String [] args )
{
Scanner scanObj = new Scanner (System.in);
System.out.println("Enter your first number ");
int no1 = scanObj.nextInt();
System.out.println("Enter your Second number ");
int no2 = scanObj.nextInt();
Swap_2 swapObj = new Swap_2();
swapObj.twoNum(no1 , no2);
}
void twoNum(int no1 , int no2)
{
int first = no1;
int second = no2;
System.out.println("before swaping two numbers  ");
System.out.println(" no1 =  " + first );
System.out.println(" no2 =   " + second );
first = no1 + no2 ; // 10 + 5 = 15
second = first - second ; // 15 -5 = 10
first = second - first ; // 10 - 5 = 5
first = (first<0)? first*(-1):first ; // ternary operator 
System.out.println("after swaping two numbers  ");
System.out.println(" no1 =  " + first );
System.out.println(" no2 =   " + second );
}
}


