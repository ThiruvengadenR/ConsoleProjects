package PatternProgram;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Pattern1 obj = new Pattern1();
		obj.diamondPattern();
	}
	void diamondPattern()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter you Number ");
		int num = sobj.nextInt();
		int colum = num;
		int find = (num/2)+1;
		while(colum>0)
		{
			if((colum)<find)
			{
				System.out.print("*");
			}
			if((colum)>find)
			{
			System.out.print("*");
			}
			if(colum==find)
			{
				System.out.print("^");
			}
			colum--;
		}
	}

}
