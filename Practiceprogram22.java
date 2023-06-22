package whileloop1;

public class Practiceprogram22 {
	public static void main(String[] args) {
		Practiceprogram22 obj22 = new Practiceprogram22();
		int num = -58;
		//obj22.prime_number(num);
		//obj22.reverse_check_prime(num);
		//obj22.sumOfDigits_prime(num);
		//obj22.sumOfDigits_untilOnes_prime(num);
		obj22.productofDigits_number(num);
		
	}
	void productofDigits_number(int num) 
	{
		int total = 1;
		int copy = num;
		while(copy>0 || copy<0)
		{
			if(copy<0)
			{
				copy = -1*copy;
			}
			total =total * (copy%10);
			copy = copy/10;
		}
		System.out.println("Given number is " + num );
		System.out.println("Product of the given digits " + total);
		prime_number(total);
		
	}
	void sumOfDigits_untilOnes_prime(int num)
	{
		int total = 0;
		int copy = num;
		int reTotal = 0;
		while(copy>0 || copy<0)
		{
			if(copy<0)
			{
				copy = -1*copy;
			}
			total =total + copy%10;
			copy = copy/10;
		}
		if(total>9)
		{
			while(total>0)
			{
				reTotal = reTotal + total%10;
				total = total/10;
			}
			System.out.println("Sum of the digits until single digits is " + reTotal);
			prime_number(reTotal);
		}
		else
		{
			System.out.println("Sum of the digits until single digits is " + total);
			prime_number(total);
		}
	}
	void sumOfDigits_prime(int num)
	{
		int total = 0;
		int copy = num;
		while(copy>0 || copy<0)
		{
			if(copy<0)
			{
				copy = -1*copy;
			}
			total =total + copy%10;
			copy = copy/10;
		}
		System.out.println("Given number is " + num );
		System.out.println("Sum of the given number " + total);
		prime_number(total);
	}
	void reverse_check_prime(int num)//121
	{
		int rev = 0;
		int copy = num;
		while(copy>0 || copy<0)
		{
			if(copy<0)
			{
				copy = -1*copy;
			}
			rev = rev*10 + copy%10;
			copy = copy/10;
		}
		System.out.println("Given number is " + num);
		System.out.println("Reversed number is " + rev);
		prime_number(rev);
	}
	void prime_number(int num)
	{
		if(num<0)
		{
			System.out.println("Please enter positive number");
		}
		int divi = 2;
		boolean flag = false;
		while(divi<=num/2)
		{
			if(num%divi == 0)
			{
				System.out.println(num + "  Given number is not a prime");
				flag = true;
				break;
			}
			divi++;
		}
		if(flag==false)
		{
			System.out.println(num + "  Given number is prime");
		}
	}

}
