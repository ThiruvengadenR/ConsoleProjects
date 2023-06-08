class Laptop
{
public static void main (String [] args )
{
Laptop lapObj = new Laptop ();
lapObj.msWord();
lapObj.msExcel();
}
void msWord()
{
System.out.println(" ms word commonly used for document writting ");
}
void msExcel()
{
System.out.println(" ms execl used for math calculation ");
}
}

class GameingLaptop extends Laptop
{
public static void main (String [] args )
{
GameingLaptop gamObj = new GameingLaptop ();
gamObj.freefire();
gamObj.msWord();

}
void freefire()
{
System.out.println(" firefree is a high graphics game ");
}
}


 class BusinessLap extends Laptop
{
public static void main (String [] args )
{
BusinessLap busObj = new BusinessLap();
busObj.msExcel();
busObj.battery();
}
void battery ()
{
System.out.println(" business laptop give 3 hours battery packup");
}
}

