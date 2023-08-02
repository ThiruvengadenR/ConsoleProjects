package StringClass;

public class PraticeProgramJuly26 {
	static String name = "Amma";
	static String india = "Jana gana mana adhinayaka jaya he Bharata bhagya vidhata Punjaba Sindhu Gujarata Maratha Dravida Utkala Banga ";
	static String quotes = "I am a java developer, i love java , i can do java programs";
	public static void main(String[] args) {
		PraticeProgramJuly26 obj = new PraticeProgramJuly26();
		//obj.stringReversing(name);
		//obj.addGivenNumberBeforeTheNUmber(91,12345);
		//obj.addGivenNumberBeforeTheNUmberAndNumber(91,4535,123);
		//obj.numberOfCharactersInThatSentence(india);
		//obj.stringIsPalindromeOrNot(name);
	//	obj.firstCharacterToUpperCase(india);
		String originalWord = "java";
		String replaceWord = "Python";
		//obj.ChangeWordWithPredefinedFuntions(quotes,originalWord,replaceWord);
		//obj.ChangeWordWithOutPredefinedFuntions(quotes,originalWord,replaceWord);
		obj.owntoUpperCase(quotes);
		obj.ownToLowerCase(quotes);
	}

	public void ownToLowerCase(String name) {
		char[] LowerCase= name.toCharArray();
		char [] Lower = new char [LowerCase.length];
		for(int i =0 ;i<LowerCase.length;i++)
		{
			if(LowerCase[i]>64 && LowerCase[i]<91)
			{
				Lower[i]=(char) (LowerCase[i]+32);
			}
			else
			{
				Lower[i]=LowerCase[i];
			}
		}
		String LowerCaseTransform = new String(Lower);
		System.out.println(LowerCaseTransform);
	
		
	}

	public void owntoUpperCase(String name) {
		char[] upperCase= name.toCharArray();
		char [] upper = new char [upperCase.length];
		for(int i =0 ;i<upperCase.length;i++)
		{
			if(upperCase[i]>96 && upperCase[i]<123)
			{
				upper[i]=(char) (upperCase[i]-32);
			}
			else
			{
				upper[i]=upperCase[i];
			}
		}
		String upperTransform = new String(upper);
		System.out.println(upperTransform);
		
	}

	public void ChangeWordWithOutPredefinedFuntions(String quotes, String originalWord, String replaceWord) {
		String [] replacesplit = quotes.split(" ");
		String [] replace = new String[replacesplit.length];
		for(int i=0;i<replacesplit.length;i++)
		{
			if(replacesplit[i].equalsIgnoreCase(originalWord))
			{
				replace[i]=replaceWord;
			}
			else
			{
				replace[i]=replacesplit[i];
			}
		}
		for(int i=0;i<replace.length;i++)
		{
			System.out.print(replace[i]+" ");
		}
	}

	public void ChangeWordWithPredefinedFuntions(String quotes,String originalWord, String replaceWord) {
		String update = quotes.replaceAll(originalWord, replaceWord);
		System.out.println(update);
		
	}

	private void firstCharacterToUpperCase(String india) {
		String [] spliting = india.split(" ");
		for(int i =0;i<spliting.length;i++)
		{
			String temp = spliting[i];
			char [] capFirst = temp.toCharArray();
			if(capFirst[0]>96 && capFirst[0]<123)
			{
				capFirst[0]= (char) (capFirst[0]-32);
			}
			String callCon = new String(capFirst);
			//System.out.println(callCon);
			spliting[i]=callCon;
			
					}
		for(int i =0;i<spliting.length;i++) {
			System.out.print (spliting[i]+" ");
		}
		System.out.println();
	}

	public void stringIsPalindromeOrNot(String name) {
		String reverse = stringReversing(name);
		if(name.compareToIgnoreCase(reverse)==0)
		{
			System.out.println("Given String is Palindrome ");
		}
		else
		{
			System.out.println("Given String is not  Palindrome ");
		}
		
	}

	public void numberOfCharactersInThatSentence(String india) {
		char [] numberCount = india.toCharArray();
		System.out.println("Number of characters in that sentence "+ numberCount.length);
		String [] numberOfWords = india.split(" ");
		System.out.println("Number of word in the sentence " + numberOfWords.length);
	}

	private void addGivenNumberBeforeTheNUmberAndNumber(int beforenum, int num, int numAdd) {
//		 int number = 12345;
//		   output: 9112345;
//				String first = String.valueOf(beforenum);
//				String second =String.valueOf(num);
//				String third = first+second;
		int first = beforenum;
		int second = num;
		String secondcopy =String.valueOf(num);
		int count = secondcopy.length();
		int powercount=1;
		for(int power =1 ; power<=count;power++)
		{
			powercount=powercount*10;
		}
		first = first*(powercount);
		int third = first + second+ numAdd;
		 System.out.println(third);
	}

	public  void addGivenNumberBeforeTheNUmber(int beforeadd, int afterplace) {
//		 int number = 12345;
//		   output: 9112345;
		String first = String.valueOf(beforeadd);
		String second =String.valueOf(afterplace);
		System.out.println(first + second);
	}

	 public  String stringReversing(String name) {
//		 input : "vanaja"
//		 output: "ajanav"
		char [] string = name.toCharArray();
		char [] rev = new char [string.length];
		int j=0;
		for(int idex=string.length-1;idex>=0;idex--)
		{
			rev[j]=string[idex];
			j++;
		}
		String reversed = new String(rev);
		System.out.println("Given  String "+name);
		System.out.println("Reserved String "+reversed);
		return reversed;
 		
		
	}

}
