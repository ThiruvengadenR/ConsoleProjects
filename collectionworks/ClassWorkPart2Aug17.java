package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassWorkPart2Aug17 {
	public static void main(String[] args) {
		ClassWorkPart2Aug17 obj = new ClassWorkPart2Aug17();
		obj.sortTheTeamMateName();	
		
	}

	private void sortTheTeamMateName() {
		ArrayList al = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you Team member name in single line (Example : Thiru-Hanu-Vijay )");
		String name = sc.nextLine();
		String [] array = name.split("-");
//		for(String a : array)
//		{
//			System.out.println(a);
//		}
		int num =0;
		int size = array.length;

		while(num<size)
		{
			al.add(array[num]);
			num++;
		}
		int num1 =0;
		int size1 = array.length;
		String temp = (String) al.get(0);
		String temp1 = (String) al.get(0);
		int count =0;
		int count1 =0;
		while(num1<size1-1)
		{
			int numFromCompare = temp.compareTo((String) al.get(num1+1));
			if(numFromCompare>0)
			{
				count++;
				temp =(String) al.get(num1);
				al.set(num1,al.get(num1+1));
				al.set(num1+1, temp);
				//System.out.println(al);
				if(count>0)
				{
					num1=0;
					count--;
					temp = (String) al.get(0);
					continue;
				}
			}
							//			if(num1==size1-2 && count1 ==0)
							//			{
							//				count1++;
							//				temp = (String) al.get(size-1);
							//				numFromCompare = temp.compareTo((String) al.get(num1-2));
							//				if(numFromCompare>0)
							//				{
							//					count++;
							//					temp =(String) al.get(num1);
							//					al.set(num1,al.get(num1+1));
							//					al.set(num1+1, temp);
							//					System.out.println(al);
							//					if(count>0)
							//					{
							//						num1=0;
							//						count--;
							//						temp = (String) al.get(0);
							//						continue;
							//					}
							//			}
							//			}

			//System.out.println(numFromCompare );
			num1++;
			temp =(String) al.get(num1);
		}

		System.out.println(al);

	}

}
