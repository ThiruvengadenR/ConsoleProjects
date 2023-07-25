package ArrayPack;

public class charArray {
	static char [] alpha =new char[26];
	final static char [] smallVowel = {'a','e','i','o','u'};
	final static char [] captialVowel = {'A','E','I','O','U'};
	final static char [] captial_Small_Vowel = {'A','E','I','O','U','a','e','i','o','u'};
	final static char [] arrayMixer = {'a','b','A','X','c','d','e','O','i','t','0','4','$','U'};
	final static char [] name = {'t','T','h','H','i','I','u','U'};
	public static void main(String[] args) {
		charArray obj = new charArray();
		obj.addSmallAlphabetInCharArray(alpha);
		//obj.printCharArray(alpha);
		obj.getAllNonVowelsAlphabets(alpha ,smallVowel);
		obj.printingSmallLetters(captial_Small_Vowel);
		//obj.countSmallLetter(captial_Small_Vowel);
		obj.printingVowelsNonCaseSensitive(arrayMixer);
		//obj.countForVowelNonCaseSensitive(arrayMixer);
		//obj.countForNewArrayFindSameElement(arrayMixer ,name);
		obj.printingSimiliarNewArray(arrayMixer,name);
	}
	
     void printingSimiliarNewArray(char[] arraymixer, char[] name) {
    	 int count =countForNewArrayFindSameElement(arraymixer ,name);
    	 if(count>0)
    	 {
		char [] newARRAY = new char [countForNewArrayFindSameElement(arraymixer ,name)];
		int k=0;
		for(int i=0;i<arraymixer.length;i++)
		{
			for(int j=0;j<name.length;j++)
			{
				if(arraymixer[i]==name[j])
				{
					newARRAY[k]=arraymixer[i];
					k++;
				}
			}
		}
		printCharArray(newARRAY);
	}
    	 else
    	 {
    		 System.out.println("No common element in two given array");
    	 }
     }

	int countForNewArrayFindSameElement(char[] arraymixer, char[] name) {
    	int count =0;
		for(int i=0;i<arraymixer.length;i++)
		{
			for(int j=0;j<name.length;j++)
			{
				if(arraymixer[i]==name[j])
				{
					count++;
				}
			}
		}
		System.out.println("similar elements in given array " + count);
		return count;
		
	}

	int countForVowelNonCaseSensitive(char[] arraymixer) {
    	int count =0;
    	for(int i=0;i<arraymixer.length;i++)
    	{
    		if(arraymixer[i]=='a'||arraymixer[i]=='e'||arraymixer[i]=='i'||arraymixer[i]=='o'||arraymixer[i]=='u')
    		{
    			count++;
    		}
    		else if(arraymixer[i]=='A'||arraymixer[i]=='E'||arraymixer[i]=='I'||arraymixer[i]=='O'||arraymixer[i]=='U')
    		{
    			count++;
    		}
    	}
    	System.out.println("count For Vowel Non CaseSensitive in given array "+count);
    	return count;
		
		
	}

	void printingVowelsNonCaseSensitive(char[] arraymixer) {
		int k =0;
		char [] VowelsNonCaseSensitive = new char [countForVowelNonCaseSensitive(arraymixer)];
		for(int i=0;i<arraymixer.length;i++)
		{
    		if(arraymixer[i]=='a'||arraymixer[i]=='e'||arraymixer[i]=='i'||arraymixer[i]=='o'||arraymixer[i]=='u')
    		{
    			VowelsNonCaseSensitive[k]=arraymixer[i];
    			k++;
    		}
    		else if(arraymixer[i]=='A'||arraymixer[i]=='E'||arraymixer[i]=='I'||arraymixer[i]=='O'||arraymixer[i]=='U')
    		{
    			VowelsNonCaseSensitive[k]=arraymixer[i];
    			k++;
    		}
		}
		printCharArray(VowelsNonCaseSensitive );
		
		
	}

	 int countSmallLetter(char[] captialSmallVowel) {
    	// counting small letter in the given array
    	int start = 97;
    	int end = 97+26; 
    	int count =0;
    	for(int i=0;i<captialSmallVowel.length;i++)
    	{
    		if(captialSmallVowel[i] >=start && captialSmallVowel[i]<=end)
    		{
    			count++;
    		}
    	}
    	System.out.println("number of small letter in  given array " + count) ;
    	return count;
		
	}

	void printingSmallLetters(char[] captialSmallVowel) {
		// printing small letter in the given array .
    	char [] onlySmallLetter = new char [countSmallLetter(captialSmallVowel)]; 
    	int start = 97;
    	int end = 97+26; 
    	int k=0;
    	for(int i=0;i<captialSmallVowel.length;i++)
    	{
    		if(captialSmallVowel[i] >=start && captialSmallVowel[i]<=end)
    		{
    			onlySmallLetter[k]=captialSmallVowel[i];
    			k++;
    		}
    	}
    	printCharArray(onlySmallLetter);
	}

	void getAllNonVowelsAlphabets(char[] alpha , char[] smallVowel) {
		char[] nonVowel = new char[alpha.length-smallVowel.length];
		int k=0;
		for(int i =0 ; i<alpha.length;i++)
		{
			boolean flag = false;
			for(int j=0;j<smallVowel.length;j++)
			{
				if(alpha[i]==smallVowel[j])
				{
					flag = true;
				}
			}
			if(flag==false)
			{
				nonVowel[k]=alpha[i];
				k++;
			}
		}
		System.out.println("Printing all non vowels alphabets");
		printCharArray(nonVowel);
		
	}

	void printCharArray(char[] alpha) {
		for(int i=0 ; i<alpha.length;i++)
		{
			System.out.print(alpha[i]+" ");
		}
		System.out.println();
	}
	
	void addSmallAlphabetInCharArray(char[] alpha) {
		char a = 97;
		for (int i=0;i<alpha.length;i++)
		{
			alpha[i]=a;
			a++;
		}
		System.out.println("Printing all small alphabets");
		printCharArray(alpha);
	}
}
