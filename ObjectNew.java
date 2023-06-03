class ObjectNew
{
public static void main(String [] args )
{
ObjectNew objRef_Men = new ObjectNew ();
int eligble = objRef_Men.getAge(); // storing return value from the method 
String vote = (eligble>18)? "ready_to_vote" : "not_eligble_to_vote" ; // ternary operator 
System.out.println(vote);
}
int getAge()
{
int year_of_bith = 2002;
int age = 2023-year_of_bith;
System.out.println("Calulated age   " + age  );
return age; // i am forget all the keywords start from small letter 
}
 }
