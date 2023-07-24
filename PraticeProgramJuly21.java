package ArrayPack;

public class PraticeProgramJuly21 {
	static int array [] = {-21,5,-75,98,75,12,-32,-56,101,-2,5,-21};
	static int array1 [] = {1,2,3,4,5};
	public static void main(String[] args) {
		PraticeProgramJuly21 obj = new PraticeProgramJuly21();
		//obj.countNegativeNumberInArray(array );
		 	//obj.saveNegativeNumberInArray(array );
		//obj.findingTheAdjacentElements(array,-75);
		//obj.printingTheAdjacentElements(array,-21);
			//obj.firstRepeatedElement(array1);
		obj.firstNonRepeatedElement(array1);
		
		
		
	}
	 void firstNonRepeatedElement(int [] array) {
		// first non repeated element in an array.
		 int count =0;
		 boolean flag =false;
		 for(int i=0;i<array.length;i++)
		 {
			 for(int j=i+1;j<array.length;j++)
			 {
				 if(array[i]==array[j])
				 {
					 flag=true;
				 }
			 }
			 if(flag==false)
			 {
				 System.out.println("First non repeated number in the Given array " + array[i]);
				 count++;
				 break;
			 }
		 }
		 if(count==0)
		 {
			 System.out.println("Given array does contain any non repeated number");
		 }
		
	}
	void firstRepeatedElement(int[] array) {
		 // first repeated element in an array.
		 boolean flag=false;
		 int count=0;
		for(int i =0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					System.out.println("First Repeated number in the given array is " + array[i]);
					flag=true;
					count++;
				}
			}
			if(flag==true)
			{
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Given Array does not contain any repeated element");
		}
		
	}
	 int findingTheAdjacentElements(int[] array, int element) {
		int index =-1;
		for(int i =0;i<array.length;i++)
		{
			if(array[i]==element)
			{
				index=i;
				break;
			}
		}
		return index;
	}
	 void printingTheAdjacentElements(int[] array, int element) {
		//.Printing the adjacent  elements for a element in an given array.
		int index= findingTheAdjacentElements( array, element);
		//System.out.println(index);
		boolean flag=false;
		for(int i =0;i<array.length;i++)
		{
			if(index<0)
			{
				break;
			}
			if(i==(index-1) ||i==index+1 )
			{
				if(i==(index-1))
				{
					System.out.println("Left Adjacent Element is "+ array[i]);
				}
				else
				{
				System.out.print("Right Adjacent Element is "+ array[i]+" ");
				flag=true;
				}
			}
			if(i>index+1)
			{
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Given number is not in the array ");
		}
		System.out.println();
		
		
		
		
	}
	 int countNegativeNumberInArray(int[] array) {
		// copy only negative number from the given array and save it in new array.
		int count=0;
		for(int i =0;i<array.length;i++)
		{
			if(array[i]<0)
			{
				count++;
			}
		}
		return count;
		

		
	}
	 void saveNegativeNumberInArray(int [] array) {
		int [] newArray = new int [countNegativeNumberInArray(array)];
		System.out.println("count "+countNegativeNumberInArray(array));
			int j=0;	
		for(int i =0;i<array.length;i++)
		{
			if(array[i]<0)
			{
				newArray[j]=array[i];
				j++;
			}
		}
		PraticeProgramJuly16 obj = new PraticeProgramJuly16();
		obj.printingArray(newArray);
		
	}

}
