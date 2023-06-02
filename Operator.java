class Operator 
{
public static void main (String [] args)
{
Operator opeObj = new Operator();
opeObj.arithmetic();
opeObj.relational();
opeObj.assignment();
opeObj.logical();
}
void arithmetic()
{
int no1 = 87;
int no2 = 45;
int no3 = no1+no2;
int no4 = no1-no2;
int no5 = no1*no2;
int no6 = no1%no2;
int no7 = no1/no2;
System.out.println("add  " +  no3);
System.out.println("sub  " +  no4);
System.out.println("multiple  "+  no5);
System.out.println("modulo " +   no7);
System.out.println("divi " +  no6);
}
void relational()
{
int no1 = 87;
int no2 = 45;
boolean no3 = no1>no2;
boolean no4 = no1<no2;
boolean no5 = no1>=no2;
boolean no6 = no1<=no2;
boolean no7 = no1!=no2;
System.out.println("no1 greater than no2 " +  no3);
System.out.println("no1 lesser than no2  " +  no4);
System.out.println("no1 greater than or equal to no2  "+  no5);
System.out.println("no1 lesser than or equal to no2 " +   no7);
System.out.println("no1 not equal to no2 " +  no6);
}
void assignment()
{
int no1 = 100;
no1 +=  10;
int no2 = 100;
no2 -= 20;
int no3 = 100;
no3 *= 10;
int no4 = 100;
no4 /= 10;
int no5 = 100;
no5 %= 10;
System.out.println(" =  " +  no1);
System.out.println("+=   " +  no2);
System.out.println("-=   "+  no3);
System.out.println("/=   " +   no4);
System.out.println("%=   " +  no5);
}
void logical()
{
int no1 =140;
int no2 = 120;
int no3 = 160;
boolean and = (no1>no2) && (no1>no3);
boolean or = (no1>no2)  || (no1>no3);
boolean not = !((no1>no2) && (no1>no3)); // expected outcome is true 
System.out.println("both statement correct   " +  and );
System.out.println("any one statement correct   " +  or );
System.out.println(" give opposite result  "+  not );

}
}


