package Collection;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class PraticeProgramAug22task2 {
static 	ArrayList c = new ArrayList();

	public static void main(String[] args) throws IOException {
		PraticeProgramAug22task2 obj = new PraticeProgramAug22task2();
		obj.readsDataFromTheConsole();
		obj.getAllSimilarTypesAndSaveItInAList(c);

	}

	private void getAllSimilarTypesAndSaveItInAList(ArrayList c) {
		ArrayList <Float> Farray = new ArrayList();
		ArrayList <Integer> Iarray = new ArrayList();
		ArrayList <Boolean> Barray = new ArrayList();
		ArrayList <String> Sarray = new ArrayList();
		ArrayList <Double> Darray = new ArrayList();
		int num=0;
		int size = c.size();
		while(num<size)
		{
			String name = (String) c.get(num);
			int numIndex = name.charAt(0);
			boolean PointCheck = name.contains(".");
			boolean FloatCheck = name.contains("f");
			//System.out.println("num idex " + numIndex);
			
				if(numIndex>47 && numIndex<58 && PointCheck && FloatCheck)
				{
					Farray.add(Float.parseFloat((String)c.get(num)));
				}
		    	else if(numIndex>47 && numIndex<58 && PointCheck)
				{
					Darray.add(Double.parseDouble((String)c.get(num)));
				}
				else if(numIndex>47 && numIndex<58)
				{
					Iarray.add(Integer.parseInt((String)c.get(num)));
				}
				else if(name.equals("true") || name.equals("false") )
				{

					boolean value = name.equals("true") ? Barray.add(true) : Barray.add(false);
				}
				else
				{
					Sarray.add((String) c.get(num) );
				}
			num++;
		}
		System.out.println("Givem array " + c);
		System.out.println("Interger array "+Iarray);
		System.out.println("Float array "+Farray);
		System.out.println("Double array "+Darray);
		System.out.println("Boolean array "+Barray);
		System.out.println("String array "+Sarray);
	}



	private void readsDataFromTheConsole() throws IOException {
		DataInputStream dis = new DataInputStream(System.in) ;
	//	Scanner sc =new Scanner(System.in);
	//	sc.
		String end ="";
		System.out.println("Enter your input data ");
		int input;
		while((input =dis.read()) != '!')
		{
			end = end + (char)input;
		}
		dis.close();
		//System.out.println(end.length());
		//System.out.println("output "+ end);
		String  [] array = end.split(" ");
		int num =0;
		int size = array.length;
		while(num<size)
		{
			c.add(array[num]);
			num++;
		}
		//System.out.println("Collection values "+c);
	}
}


