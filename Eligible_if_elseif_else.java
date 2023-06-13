import java.util.Scanner;
class Eligible_if_elseif_else
{
public static void main(String [] args )
    {
        Scanner scanObj = new Scanner(System.in);
        System.out.println(" please enter your age  ");
        System.out.println(" ^^^ important note ^^^ : !!! don't use deciaml values  !!1 ");
        int age = scanObj.nextInt();
        Eligible_if_elseif_else eligObj = new Eligible_if_elseif_else();
        eligObj.vote(age);
    }

void vote (int age )
    {
        if (age>=18 && age<=120)
        {
        System.out.println("your eliglibe for vote ");
        }
        else if (age<=17 && age >=0)
        {
        System.out.println("your  not eliglibe for vote ");
        }
        else
        {
        System.out.println(" double check your age  ");
        }

    }

}
