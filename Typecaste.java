class Typecaste 
{
public static void main (String [] args )
{
Typecaste casteObj = new Typecaste();
casteObj.intTObyte();//narrowing casting
casteObj.intTOshort();
//casteObj.intTOboolean(); from this observation boolean cannot be used in type casting 
casteObj.intTOchar();
casteObj.charTOint();
casteObj.floatTOint();
casteObj.doubleTOdouble();
casteObj.doubleTOfloat();
}
void intTObyte()
{
int no1 = 1234;
byte no2 = (byte)no1 ;
System.out.println(no2);
}
void intTOshort()
{
int no1 = 1234;
short no2 = (byte)no1 ;
System.out.println(no2);
}
/*void intTOboolean()
{
int no1 = 12;
boolean no2 = (boolean)no1;
System.out.println(no2);
}	*/	
void intTOchar()// from this observation number are converted into unique code 
{
long no1 = 3456546745667l;
char no2 = (char)no1;
System.out.println(no2);
}
void charTOint()
{
char no1 = 'T';// if we give double Quotes java consider as String Even Char keyword to be used in before the variable name. 
int no2 = (int)no1;
System.out.println(no2);
}
void floatTOint() // decimal values are eliminated totally 
{
float no1 = 34.845f;
int no2 = (int)no1;
System.out.println(no2);
}
void doubleTOdouble() // expacted outcome number with 6 decimal points 
{
double no1 = 34.8454545787;
double no2 = (float)no1;
System.out.println(no2); // actual outcome 34.845455169677734
}
void doubleTOfloat()
{
double no1 = 34.8454545787;
float no2 = (float)no1;
System.out.println(no2); 
}
}
