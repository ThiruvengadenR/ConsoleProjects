package ArrayPack;

public class PracticeProgramJuly19 {

	public static void main(String[] args) {
		int [] sourceArray = {21,31,25,20,30,5,8,9,12};
		int [] sourceArray2 = {21,25,21,21,25,90,35,9,90,35};
		PracticeProgramJuly19 obj = new PracticeProgramJuly19();
		int [] newArray = new int [sourceArray.length];
//		obj.copyArray(sourceArray,newArray);
//		obj.printArray(newArray);
	//	obj.ascendingSort(sourceArray);
	//	obj.descendingSort(sourceArray);
	//	obj.addNewElementZeroIndex(sourceArray,45,5);
	//	obj.countDuplicateElemnt(sourceArray2);
	//	obj.removeDuplicateElement(sourceArray2);
	}

	public void removeDuplicateElement(int[] sourceArray2) {
		int [] removeElement = new int[sourceArray2.length-countDuplicateElemnt(sourceArray2)];
		int [] sourceCopy = new int[sourceArray2.length];
		copyArray(sourceArray2,sourceCopy);
		ascendingSort(sourceCopy);
		int count=0;
		int k=0;
		for(int i =0 ;i<sourceCopy.length;i=i+1+count)
		{
			count=0;
			for(int j =i+1 ;j<sourceCopy.length;j++)
			{
				if(sourceCopy[i]==sourceCopy[j])
				{
					count++;
				}
			}
		removeElement[k]=sourceCopy[i];
		k++;	
			
		}
		System.out.println("Duplicate element Removed ");
		printArray(removeElement);
		
	}

	public int countDuplicateElemnt(int[] sourceArray2) {
		int count=0;
		int temp=0;
		int [] findDuplicateArray = new int [sourceArray2.length];
		copyArray(sourceArray2,findDuplicateArray);
		ascendingSort(findDuplicateArray);
		//printArray(findDuplicateArray);
		for(int i = 0;i<findDuplicateArray.length;i=i+1+count)
		{
			count =0;
			for(int j =i+1;j<findDuplicateArray.length;j++)
			{
				if(findDuplicateArray[i]==findDuplicateArray[j])
				{
					count++;
				}
			}
			temp=temp+count;
			
		}
		System.out.println("Number of Dupilcate in Given Array"+temp);
		return temp;
		
	}

	public void addNewElementZeroIndex(int[] sourceArray, int newElement,int index) {
		int [] elementAdd = new int [sourceArray.length+1];
		int j=0;
		for(int i=0 ; i<elementAdd.length;i++)
		{
			if(i==index)
			{
				elementAdd[i]=newElement;
			}
			else if(i>index || i<index)
			{
				elementAdd[i]=sourceArray[j];
				j++;
			}
		}
		System.out.print("After Addtion of new Element in "+index + " index ");
		printArray(elementAdd);
		
	}

	public void descendingSort(int[] descending) {
//		int descending[] = new int [sourceArray.length];
//		copyArray(sourceArray,descending);
		System.out.print("Before sort ");
		printArray(descending);
		for(int i =0 ; i<descending.length;i++)
		{
			for(int j=i+1 ;j<descending.length;j++)
			{
				if(descending[i]<descending[j])
				{
					int temp = descending[i];
					descending[i]=descending[j];
					descending[j]=temp;
				}
			}
		}
		System.out.print("After sort ");
		printArray(descending);
		
	}

	public void ascendingSort(int[] ascending) {
		//int ascending[] = new int [sourceArray.length];
		//copyArray(sourceArray,ascending);
		System.out.print("Before sort ");
		printArray(ascending);
		for(int i =0 ; i<ascending.length;i++)
		{
			for(int j=i+1 ;j<ascending.length;j++)
			{
				if(ascending[i]>ascending[j])
				{
					int temp = ascending[i];
					ascending[i]=ascending[j];
					ascending[j]=temp;
				}
			}
		}
		System.out.print("After sort ");
		printArray(ascending);
		
		
	}

	public void printArray(int[] newArray) {
		System.out.println("Printing the Array");
		for(int i=0;i<newArray.length;i++)
		{
			System.out.print(newArray[i] +" ");
		}
		System.out.println();
	}

	public void copyArray(int[] sourceArray, int[] newArray) {
		for (int i=0 ;i<sourceArray.length;i++)
		{
			newArray[i]=sourceArray[i];
		}
		
	}

}
