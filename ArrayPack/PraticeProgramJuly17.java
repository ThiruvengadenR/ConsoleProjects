package ArrayPack;

public class PraticeProgramJuly17 {
	final static int a []= {1,2,3,4,5,10,45,65,56,89};
	//final static int b []= {5,4,8,2,1,21,45,45};
	final static int b []= {1,2,3,4,5,5,10,45,100};
	static PraticeProgramJuly16 obj16 = new PraticeProgramJuly16();

	public static void main(String[] args) {
		PraticeProgramJuly17 praticeObj = new PraticeProgramJuly17();
	//	praticeObj.MinLength(a,b);
		praticeObj.additionOfTwoArray(a,b);
		praticeObj.joiningOfTwoArray(b,a);
  		praticeObj.usingSetRules_TwoArray(b,a);
  		praticeObj.usingSetRulesSub_TwoArray(b,a);
	//	praticeObj.commonElement(a,b);
	}


void usingSetRulesSub_TwoArray(int[] a2, int[] b2) {
	 	System.out.println("Printing first array sub second array ");
		int [] c= new int[a2.length-commonElement(a2,b2)];
		int k=0;
		for(int i=0;i<a2.length;i++)
		{
			boolean flag = false;
			for(int j=0;j<b2.length;j++)
			{
				if(a2[i]==b2[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				c[k]=a2[i];
				k++;
			}
		}
		PraticeProgramJuly16 obj = new PraticeProgramJuly16();
		obj.printingArray(c);
	}


int MinLength(int[] a2, int[] b2) {
	int a2Length = a2.length;
	int b2Length = b2.length;
	int minFind;
	if(a2Length>=b2Length )
	{
		minFind=b2Length;
	}
	else
	{
		minFind=a2Length;
	}
	return minFind;	
	}


void usingSetRules_TwoArray(int[] b2, int[] a2) {
		//int count =0;
		
		boolean flagcheck =false;
		for(int i=0;i<b2.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<a2.length;j++)
			{
				if(b2[i]==a2[j])
				{
					//count++;
					flag=true;
				}
			}
			if(flag==false)
			{
				flagcheck =true;
				System.out.println(  "First array not  present in Second  array");
				break;
			}
				
		}
		if(flagcheck==false)
		{
			System.out.println(  "First array  present in Second  array");
		}
		
	}


	int commonElement(int[] a2, int[] b2) {
		int count =0;
	    for(int j =0 ;j<a2.length;j++)
		{
		for(int i=0;i<b2.length;i++)
		{
			if (a2[j]==b2[i])
			{
				count++;
				break;
			}
		}
		}
		//System.out.println(count);
		return count;
	}

	void joiningOfTwoArray(int[] a2, int[] b2) {
		System.out.println("Joining of two array into single array");
		int c[] = new int [a2.length+b2.length];
		for(int i =0 ; i<a2.length;i++)
		{
			c[i]=a2[i];
		}
		for(int i=0;i<b2.length;i++)
		{
			c[a2.length+i] = b2[i];
		}
		obj16.printingArray(c);
		
	}


	void additionOfTwoArray(int[] a2, int[] b2) {
		System.out.println("Addition of two Array into one array");
		int c[];
		int a2Length = a2.length;
		int b2Length = b2.length;
		int minFind;
		if(a2Length>=b2Length )
		{
			int max []=new int [a2Length ];
			c=max;
			minFind=b2Length;
		}
		else
		{
			int max []=new int [b2Length ];
			c=max;
			minFind=a2Length;
		}
		
		for (int i =0;i<c.length;i++)
		{
			if(i<minFind)
			c[i]=a2[i]+b2[i];
			else if(a2.length>b2.length)
				c[i]=a2[i];
			else
				c[i]=b2[i];
		}
		obj16.printingArray(c);
		
	}

}
