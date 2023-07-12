package JavaMCQ;

public class StaticMethod {
static void add(int a , int b)
{
	int c = a+b;
	System.out.println("sum of two variables " + c);
}
static void  add(int a , int b, int c)
{
	int d = a+b+c;
	System.out.println("sum of three variables " + d);
}
	public static void main(String[] args) {
		add(5,10);
		add(10,20,30);
		

	}

}
