package Collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PraticeProgramAug22task1
{
	static List l = new ArrayList();

	public static void main(String[] args) {
		PraticeProgramAug22task1 obj = new PraticeProgramAug22task1();

		obj.getInputForArrayList();
		obj.removeAllDuplicatesFromAList(l);
	}

	private void removeAllDuplicatesFromAList(List l2) {
		ArrayList withoutDuplicate = new ArrayList();
		int num=0;
		int size = l2.size();
		while(num<size)
		{
			if(!withoutDuplicate.contains(l2.get(num)))
			{
				withoutDuplicate.add(l2.get(num));
			}
			num++;
		}
		System.out.println("Before remove all duplicates from a list "+ l2);
		System.out.println("After remove all duplicates from a list "+withoutDuplicate);
	}

	private void getInputForArrayList() 
	{
		//https://www.w3schools.com/java/java_files_read.asp 
		
		    try 
		    {
			      File myObj = new File("/home/gods/Desktop/fileio/PraticeWork.txt");
			      Scanner myReader = new Scanner(myObj);

			      while (myReader.hasNextLine()) 
			      {
				    int num=0;
			        String data = myReader.nextLine();
			        System.out.println(data);
			        String [] Strarray = data.split(",");
			        int size = (Strarray.length);
			        while(num<size)
			        {
			        	int a = Integer.parseInt(Strarray[num]);
//			        	l= l.add(Integer)a;
			        	l.add(a);
			        	//System.out.println(a);
			        	num++;
			        }

			      }
			      myReader.close();
		    }
		    catch (FileNotFoundException e) 
		    {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
		    }
		//System.out.println(l);
    
   }

}


