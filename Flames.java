package Project;

import java.util.Scanner;

public class Flames {

	public static void main(String[] args) {
		Flames obj = new Flames();
		String name1 = getInput1();
		String name2 = getInput2();
		int count = obj.getCount(name1,name2);
		obj.FlamesMethod(count);
		char a = obj.FlamesMethod(count).charAt(0);
		obj.FlamesResult(a,name1,name2);
	}

	private void FlamesResult(char a,String name1,String name2) {
//		char name = (char)a;
		switch(a)
		{
		case 'f':
		{
			System.out.println(name1 +" is Friend to "+ name2 );
			break;
		}
		case 'l':
		{
			System.out.println(name1 +" is in love with "+ name2);
			break;
		}
		case 'a':
		{
			System.out.println(name1 +" has more affection with  "+name2);
			break;
		}
		case 'm':
		{
			System.out.println(name1 +" is going to marry "+name2);
			break;
		}
		case 'e':
		{
			System.out.println(name1 +" is enemy of "+name2);
			break;
		}
		case 's':
		{
			System.out.println(name1 +" and "+name2 + " are Brother or Sister ");
			break;
		}
		}
		
	}

	private String FlamesMethod(int count1) {
			//System.out.println(count1);
		StringBuffer name = new StringBuffer("flames");
			//System.out.println(name);
	//	StringBuffer subname = new StringBuffer();
		int count =0;
		for(int i=0;i<name.length();i=i+1-1)
		{
			StringBuffer subname = new StringBuffer();
			if(count1<=name.length())//amesF
			{
				count = count1-1;
			}
			else if(count1>=name.length())
			{
				count=(count1%name.length())-1;
				if(count==-1)
				{
					count = name.length()-1;
				}
			}
			//int count = count1%name.length();
			name.deleteCharAt(count);//Fames//amsF
				//System.out.println(name);
			CharSequence se = name;
			subname = subname.append(se,count, se.length());
				//System.out.println(subname +" --> sub");		
			name.delete(count, name.length());
				//System.out.println(name);
			name = subname.append(name);//amesF
				//System.out.println(name + "-->last ");
			//subname = subname.delete(0, subname.length());
			if(name.length()==1)
			{
				return name.toString();
				//break;
			}
		}
		return null;
		
	}

	private String name(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	private int  getCount(String input1, String input2) {
		StringBuffer boyfriend = new StringBuffer(input1);
		StringBuffer girlfriend = new StringBuffer(input2);
		for(int i=0;i<boyfriend.length();i++)
		{
			for(int j=0;j<girlfriend.length();j++)
			{
				if(boyfriend.charAt(i)==girlfriend.charAt(j))
				{
					boyfriend.deleteCharAt(i);
					girlfriend.deleteCharAt(j);
					i=-1;
					break;
				}
			}
		}
//		System.out.println("girlfriend name "+girlfriend);
//		System.out.println("boyfriend name "+ boyfriend);
		int count = boyfriend.length()+girlfriend.length();
//		System.out.println(count);
		return count;
	}

	private static String getInput2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your GirlFriend Name");
		String GirlFriend =  sc.next();
		sc.close();
		return GirlFriend.toLowerCase();
		
	}

	private static String getInput1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your BoyFriend Name");
		String BoyFriend =  sc.next();
		//sc.close();
		return BoyFriend.toLowerCase();
		
	}

}