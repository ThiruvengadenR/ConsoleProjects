package ArrayPack;

public class PraticeProgramJuly16 {
	static int checkElement = 32;
	//final static int array [] = {12,5,4,89,45,665,741,931,745};
	public static void main(String[] args) {
	    int array [] = {12,5,4,89,45,665,741,931,745};
		int revArray [] = new int[array.length];
		PraticeProgramJuly16 obj = new PraticeProgramJuly16();
//		obj.reverseOrderArray(array , revArray);
//		obj.printingNewArray(revArray);
//		obj.givenElementInArray(array,checkElement);
//		obj.largestNumberInArray(array);
//		obj.smallestNumberInArray(array);
//		obj.LargestInArray(array,4);
//		obj.SmallestInArray(array,2);
	//	obj.singleRotationAntiClock(array,3);
		obj.printingArray(array);
		
	}
 public   void printingArray(int[] array) {
    	for(int i =0;i<array.length;i++)
    	{
    		System.out.print(array[i] +" ");
    	}
		System.out.println();
		
	}
	void singleRotationAntiClock(int[] array ,int rotation) {
    	int rotationArray [] = new int[rotation];
    	for(int i =0; i<rotation;i++)
    	{
    		rotationArray [i] = array[i];
    	}
    	
    	int arrayCopy [] = new int[array.length];
    	for(int i =0;i<array.length;i++)
    	{
    		arrayCopy[i]=array[i];
    	}
    	int num = rotation;
    	for(int i=0;i<(arrayCopy.length)-(num);i++)
    	//for(int i=0;i<(arrayCopy.length)-(2);i++)
        	//for(int i=0;i<(arrayCopy.length)-(rotation);i++)// why values are change
    	{
    		arrayCopy[i]=array[rotation];
    		if(rotation<arrayCopy.length)
    		rotation++;
    	}
    	int j=0;
    	for(int i=((arrayCopy.length)-(num));i<arrayCopy.length;i++)
    	{
    		arrayCopy[i]=rotationArray[j];
    		j++;
    	}
		
    	for(int i=0;i<arrayCopy.length;i++)
    	{
    		System.out.print(arrayCopy[i]+" ");
    	}
		
	}
	void SmallestInArray(int[] array, int num) {
//    	int arrayCopy1 [] = array ; // array will change whenever you change yout copyArray
    	int arrayCopy [] = new int[array.length];
    	for(int i =0;i<array.length;i++)
    	{
    		arrayCopy[i]=array[i];
    	}
    	int [] newArray =  new int[arrayCopy.length];
    	
        int largeRef = arrayCopy[0];
    	for(int i =0;i<arrayCopy.length;i++)
    	{
    		if(arrayCopy[i]>largeRef)
    		{
    			largeRef = arrayCopy[i];
    		}
    	}

    	for(int j=0;j<newArray.length;j++)
    	{
        int smaller = arrayCopy[0];
    	for(int i =0;i<arrayCopy.length;i++)
    	{
    		if(arrayCopy[i]<smaller)
    		{
    			smaller = arrayCopy[i];
    		}
    	}
    	newArray[j]=smaller;
    	for(int i =0;i<arrayCopy.length;i++)
    	{
    		if(arrayCopy[i]==smaller)
    		{
    			arrayCopy[i]=largeRef;
    		}
    	}
    	}
    	System.out.println(num +" smaller number in the array "+newArray[num-1]);
 // newArray is used for arrange number in ascending order
    	for(int k=0 ; k<newArray.length;k++)
    	{
    		System.out.print(newArray[k]+" ");
    	}
    	System.out.println();
		
	}
	void LargestInArray(int[] array,int num)
    {
    	int arrayCopy [] = new int[array.length];
    	for(int i =0;i<array.length;i++)
    	{
    		arrayCopy[i]=array[i];
    	} 
    	int [] newArray =  new int[arrayCopy.length];
    	
        int smallRef = arrayCopy[0];
    	for(int i =0;i<arrayCopy.length;i++)
    	{
    		if(arrayCopy[i]<smallRef)
    		{
    			smallRef = arrayCopy[i];
    		}
    	}

    	for(int j=0;j<newArray.length;j++)
    	{
        int largest = arrayCopy[0];
    	for(int i =0;i<arrayCopy.length;i++)
    	{
    		if(arrayCopy[i]>largest)
    		{
    			largest = arrayCopy[i];
    		}
    	}
    	newArray[j]=largest;
    	for(int i =0;i<arrayCopy.length;i++)
    	{
    		if(arrayCopy[i]==largest)
    		{
    			arrayCopy[i]=smallRef;
    		}
    	}
    	}
    	System.out.println(num +" highest number in the array "+newArray[num-1]);
// note* newArray is used for arrange number in descending order.
    	for(int k=0 ; k<newArray.length;k++)
    	{
    		System.out.print(newArray[k]+" ");
    	}
    	System.out.println();

		
	}
	void smallestNumberInArray(int[] array) {
		int smallest = array[0];
		for(int i=0 ;i<array.length;i++)
		{
			if(array[i]<=smallest)
			{
				smallest = array[i];
			}
		}
		System.out.println("Smallest Number in the given Array " + smallest);
		
	}
	 void largestNumberInArray(int[] array) {
		int largest = array[0];
		for(int i=0 ;i<array.length;i++)
		{
			if(array[i]>=largest)
			{
				largest = array[i];
			}
		}
		System.out.println("Largest Number in the given Array " + largest);
		
	}
	void givenElementInArray(int[] array , int check) {
    	boolean flag=false;
    	for(int i =0; i<array.length;i++)
    	{
    		if(array[i]==check)
    		{
    			System.out.println("Given number "+check+" is present in the list");
    			flag=true;
    			break;
    		}
    	}
    	if(flag==false)
    	{
    		System.out.println("Given number " + check + " is not in the Array");
    	}
	}
    
	void printingNewArray(int[] revArray) {
		System.out.println("get the array in reverse order and save/add it in new array");
		for(int i=0 ; i<revArray.length;i++)
		{
			System.out.print(revArray[i]+" ");
		}
		System.out.println();
	}
	void reverseOrderArray(int arr [],int revArray [])
	{
		System.out.println("Reversing of given Array");
		int j=0;
		for(int i=1;i<=arr.length;i++)
		{
			System.out.print(arr[arr.length-i] + " ");
			revArray[j]=arr[arr.length-i];
			j++;
		}
		System.out.println();
	}

}
