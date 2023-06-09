class Student
{
public static void main (String [] args)
    {
            Student stObj = new Student();
            stObj.welcome("Thiru");
            stObj.buy(45,57);
            stObj.buy(4,8,9);
            stObj.buy(85.45,100.83);
            stObj.thank();
    }
void buy(int m , int n ,int o) // different in paramter 
   {
        int sum = m + n + o ;
        int saving = (sum/10);
        sum = sum - saving;
        System.out.println(" Your total amount " + sum + " Total savings " + saving );
   }
void buy(int a , int b)
    {
        int sum = a + b ;
        int saving = (sum/50);
        sum = sum - saving;
        System.out.println(" Your total amount " + sum + " Total savings " + saving );
    }
void buy(double a , double b)// different in datatype 
    {
        int sum = (int) (a + b) ;
        int saving = (sum/75);
        sum = sum - saving;
        System.out.println(" Your total amount " + sum + " Total savings " + saving );
    }
void welcome(String name)
    {
        System.out.println(" Wwlcome " + name );
    }
void thank()
    {
        System.out.println(" Thanks you choosing Amazon stores ");
    }
}
