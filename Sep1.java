package DailyQuiz;

import java.util.Scanner;

public class Sep1 {
	static int [] array;
	public static void main(String[] args) {
		Sep1 obj = new Sep1 ();
		//obj.initialiseArray();
		//obj.getTotal();
		obj.findRepeatedWord();
		
	}
private void findRepeatedWord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input Sentences");
		String input = sc.nextLine();
		System.out.println("Enter n(number) for finding nth repeative character in the sentence ");
		int repeat = sc.nextInt();
		sc.close();
		char [] chararray = input.toCharArray();
		int count =0;
		int charholder=0;
		boolean flag = false;
		char temp=' ';
		for(int j =0 ; j<chararray.length;j++)
		{
			 temp = chararray[charholder];
		for(int i=j ; i<chararray.length;i++)
		{

			 if(charholder==i)
			 {
				 continue;
			 }
			 if(temp==chararray[i])
			 {
				 //System.out.println(chararray[i]);
				 count++;
				 break;
			 }
		}
		charholder++;
		if(count==repeat)
		{
			System.out.println(temp);
			flag = true;
			break;
		}
		}
		if(flag==false)
		 System.out.println("No repeative character available in the specific number ");
	}

private void getTotal() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Gap (note*) --> number must be smaller than length ");
	int gap = sc.nextInt();
	int length = array.length;
	int count = length/gap;
	System.out.println("count value "+ count);
	int total = array[0];
	int temp =gap+1;
	for(int i =0;i<count;i++)
	{
		if(temp<array.length)
		{
			total = total + array[temp];
			System.out.println(array[temp]);
			temp = temp+ gap+1;
		}
	}
	System.out.println("Sum of the values inside the gap " + total );
		
	}
private void initialiseArray() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter you int array length");
	int length = sc.nextInt();
	System.out.println("Enter your starting value for int array");
	int start = sc.nextInt();
	System.out.println("Enter your increment value ");
	int increment = sc.nextInt();
	array = new int [length];
	for (int i = 0 ;i<length ;i++)
	{
		array[i]=start;
		start =  start +increment;
	}
	System.out.println("Elements in the array ");
	for(int i :array)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	
}

}
