package classWork;

import java.util.Scanner;

public class PraticeProgramAug11 {
	public static void main(String[] args) {
		PraticeProgramAug11 obj = new PraticeProgramAug11 ();
		char [] input = obj.getInput();
		obj.todayMethod(input);
		
	}

	private void todayMethod(char[] input) {
		//char [] array = new char [(input.length/2)];
		String [] arrayString = new String[(input.length/2)];
		int [] arrayint= new int[(input.length/2)];
		char [] arraychar= new char[(input.length/2)];
	//	Integer.parseInt() 
		String ref = null;
		int j=0;
		int k=0;
		for(int i=0 ;i<input.length;i++)
		{
			if(i%2==1)
			{
				//array[j]=input[i];
				arrayString[j] =ref.valueOf(input[i]);
				 arrayint[j]=Integer.parseInt(arrayString[j]);
				j++;
				
			}
			else if(i==0)
			{
				arraychar[k]=input[i];
				k++;
			}
			else if(i%2==0)
			{
				arraychar[k]=input[i];
				k++;
			}
		}
		

		for(int l =0 ;l<arrayint.length;l++)
		{
			int refloc = arrayint[l];
			for(int i=0 ;i<refloc;i++)
			{
				System.out.print(arraychar[l]);
			}
		}
		
		System.out.println();
		System.out.println("For clear output");
		for(int l =0 ;l<arrayint.length;l++)
		{
			int refloc = arrayint[l];
			for(int i=0 ;i<refloc;i++)
			{
				System.out.print(arraychar[l]);
			}
			System.out.println();
		}

			// before code of reference
//		System.out.println("print char array ");
//		for(int i=0 ;i<array.length;i++)
//		{
//			System.out.print(array[i]+" ");
//		}
//				System.out.println("print String array ");
//				for(int i=0 ;i<arrayString.length;i++)
//				{
//					System.out.print(arrayString[i]+" ");
//				}
//				System.out.println();	
//				
//			System.out.println("print int array ");
//			for(int i=0 ;i<arrayint.length;i++)
//			{
//				System.out.print(arrayint[i]+" ");
//			}
//			System.out.println();
	}

	private char[] getInput() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your input data");
		String input = sc.next();
		char [] array = input.toCharArray();
		return array;
		
	}


}
