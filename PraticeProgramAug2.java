package Recursion;

public class PraticeProgramAug2 {
	public static void main(String[] args) 
	{
		PraticeProgramAug2 obj = new PraticeProgramAug2();
		String name = "ice";
		obj.differentForm(name);
		//int num = 5;
		//System.out.println(obj.SumOfNaturalUsingRecursion(num));
		//System.out.print("Fibanocci serious until  "+num);
		//for(int i =1;i<=num;i++)
		//System.out.print(obj.fibanocciSerious(i)+" ");
		System.out.println();
	}
	int  fibanocciSerious(int num) {
		if(num ==1 || num ==2 )
		{
			return 1;
		}
		return fibanocciSerious (num-1) +fibanocciSerious (num-2);
	}
	int SumOfNaturalUsingRecursion(int num) {
		for(int i =0;i<num;i++)
		{
			if(num==1)
			{
				return 1;
				
			}
		}
		return num +SumOfNaturalUsingRecursion( num -1) ;
		
	}
	void differentForm(String name)
	{
		System.out.println("Given String -->"+ name);
		System.out.println("Different combination of Given Sring");
		char [] array = name.toCharArray();
		char temp;
		char temp1;
		//boolean flag = false;
		int count =0;
		for(int i=0;i<name.length();i++)
		{
			if(i==name.length()-1)
			{
				i=-1;
				continue;
			}
			temp=array[(name.length()-1)-i];
			temp1=array[((name.length()-1)-i)-1];
			array[((name.length()-1)-i)-1]=temp;
			array[(name.length()-1)-i]=temp1;
			String name1 = new String(array);
			System.out.println(name1);
			count++;
				if(equa(name1,name)==true)
				{
					//System.out.println(equal(name1 ,name));
					//System.out.println(i);
					break;
				}
			//System.out.println(i);
		}
		System.out.println("Count of different names "+ count);
	}
	
    public boolean equa(String name1 ,String name ) {
    	char [] array1 = name1.toCharArray();
    	char [] array2 = name.toCharArray();
    	int count =0;
    	for(int i=0;i<name.length();i++)
    	{
    		if(array1[i]==array2[i])
    		{
    			count++;
    			continue;
    		}
    		else
    		{
    			return false;
    		}
    	}
    	if(count==name.length())
    	{
    		return true;
    	}
    	return false;
    }
}
