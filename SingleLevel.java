class OneParent
{
static String name = " Raja ";
int age = 45 ;
public static void main (String [] args )
{
OneParent parObj = new OneParent ();
parObj.work();
parObj.run();

}
 void work()
{
System.out.println("im working in Tech mahendra ");
}
void run ()
{
System.out.println(" Runing is my hobbie  ");
}
}


class OneChild extends OneParent
{
static String name = " Thiru ";
public static void main (String [] args )
{
OneChild chObj = new OneChild ();
chObj.study();
chObj.run();
chObj.work();
// chObj.super.run();
System.out.println(" my  name is   " + name );
}
void study()
{
System.out.println(" im studying 1st year B.com  ");
}
void run()
{
System.out.println(" Runing is my passion ");
System.out.println(" my father name is   " + super.name );
//System.out.println(" my father name is   " + chObj.super.run());
}




}
