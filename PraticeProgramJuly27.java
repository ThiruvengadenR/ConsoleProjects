package StringClass;

public class PraticeProgramJuly27 {
	
	public static void main(String[] args) {
		
		String [] fruits = {"apple","tomato","apple","banana","mango","tomato","mango","banana"};
		
		PraticeProgramJuly27 obj = new PraticeProgramJuly27();
		obj.listOfFruits(fruits);
	}
	private void listOfFruits(String[] fruits) {
		String [] fruitCopy = new String [fruits.length];
		int k=0;
		for(int i =0 ; i<fruits.length;i++)
		{
			boolean flag = false;
			for(int j =0 ; j<fruitCopy.length;j++)
			{
				if(fruits[i]==fruitCopy[j])
				{
					 flag = true;
				}
			}
			if(flag==false)
			{
				fruitCopy[k]=fruits[i];
				k++;
			}
			
		}
//		for(String x:fruitCopy)
//		{
//			System.out.println(x);
//		}
		int [] countOfFruits = new int [fruits.length];
		for(int i=0;i<countOfFruits.length;i++)
		{
			int count =0;
			boolean flag = false;
			for(int j=0;j<countOfFruits.length;j++)
			{
				if(fruitCopy[i]==fruits[j])
				{
					count++;
					flag = true;
				}
			}
			if(flag==true)
			{
				 countOfFruits[i]=count;
			}
		}
//		for(int x:countOfFruits)
//		{
//			System.out.println(x);
//		}
		for(int j=0;j<countOfFruits.length;j++)
		{
			if(countOfFruits[j]>0)
			System.out.println(fruitCopy[j] +" "+ countOfFruits[j] );
		}
	}
}
