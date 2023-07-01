package whileloop1;

import java.util.Scanner;

public class Lcm$Hcf {

	public static void main(String[] args) {
		Lcm$Hcf obj = new Lcm$Hcf();
		obj.lcm();
		obj.hcf();

	}
	void lcm()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter your first Number ");
		int first = sobj.nextInt();
		System.out.println("Enter your second Number ");
		int second = sobj.nextInt();
		int big,small;
		int factor=2;
		if(first>second)
		{
			big=first;
			small=second;
		}
		else
		{
			big =second;
			small= first;
		}
		while(factor<=big)
		{
			if(big%factor ==0 && small%factor==0 )
			{
				System.out.println("Least common mutiple " + factor);
				break;
			}
			factor++;
		}
	}
	void hcf()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter your first Number ");
		int first = sobj.nextInt();
		System.out.println("Enter your second Number ");
		int second = sobj.nextInt();
		int big,small;
		int factor=2;
		int answer=1;
		if(first>second)
		{
			big=first;
			small=second;
		}
		else
		{
			big =second;
			small= first;
		}
		while(factor<=small)
		{
			if(big%factor ==0 && small%factor==0 )
			{
				answer=factor;
				//System.out.println("Highest common factor " + factor);
			}
			factor++;
		}
		System.out.println("Highest common factor " + answer);
	}

}
