

import java.util.Scanner;

public class Alaphabet {

	public static void main(String[] args) {
		Alaphabet obj = new Alaphabet();
		obj.patternA();
		obj.patternB();
		obj.patternC();
		obj.patternD();
		obj.patternE();
		obj.patternF();
		obj.patternG();
		obj.patternH();
		obj.patternI();
		obj.patternJ();
		obj.patternK();
		obj.patternL();
		obj.patternM();
		obj.patternN();
		obj.patternO();
		obj.patternP();
		obj.patternQ();
		obj.patternR();
		obj.patternS();
		obj.patternT();
		obj.patternU();
		obj.patternV();
		obj.patternW();
		obj.patternX();
		obj.patternY();
		obj.patternZ();
	}
public void patternZ()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		int second =row;
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount==1 || rowCount==row)
				{
					System.out.print("* ");
				}
				else if(rowCount<=row && columCount==second)
				{
					System.out.print("* ");

				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
			second--;
		}
	}
public	void patternY()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		int mid;
		if (row%2==0)
		{
			mid = row/2;
		}
		else
		{
			mid = row/2+1;
		}
		int first=1;
		int second =row;
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount<=mid && columCount==first || rowCount<=mid && columCount==second)
				{
					System.out.print("* ");
				}
				else if(rowCount>mid && columCount==mid)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
			first++;
			second--;
		}
	}
public	void patternX()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		int first=1;
		int second =row;
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount<=row && columCount==first || rowCount<=row && columCount==second)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
			first++;
			second--;
		}
	}
public	void patternW()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		int mid;
		if (row%2==0)
		{
			mid = row/2;
		}
		else
		{
			mid = row/2+1;
		}
		int first=mid;
		int second =mid;
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount<=row && columCount==1 ||rowCount<=row && columCount==colum)
				{
					System.out.print("* ");
				}
				else if(rowCount>=mid && columCount== first ||rowCount>=mid && columCount== second )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
			if(rowCount>mid)
			{
				first--;
				second++;
			}
		}
	}
public	void patternV()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		int mid;
		if (row%2==0)
		{
			mid = row/2;
		}
		else
		{
			mid = row/2+1;
		}
		int first=1;
		int second =colum;
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount<=mid && columCount==1 ||rowCount<=mid && columCount==colum)
				{
					System.out.print("* ");
				}
				else if(rowCount>mid && columCount==first ||rowCount>mid && columCount==second )
				{
					System.out.print("* ");
				}
				else if (rowCount==row && columCount==mid )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
			if(rowCount>mid)
			{
				first++;
				second--;
			}
		}
	}
public	void patternU()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		int mid;
		if (row%2==0)
		{
			mid = row/2;
		}
		else
		{
			mid = row/2+1;
		}
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount<row && columCount==1 ||rowCount<row && columCount==colum)
				{
					System.out.print("* ");
				}
				else if(rowCount==row && columCount>1 && columCount<colum)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
		}
	}
public	void patternT()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		int mid;
		if (row%2==0)
		{
			mid = row/2;
		}
		else
		{
			mid = row/2+1;
		}
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount==1 )
				{
					System.out.print("* ");
				}
				else if (rowCount>1 && columCount==mid)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
		}
	}
public	void patternS()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		int mid;
		if (row%2==0)
		{
			mid = row/2;
		}
		else
		{
			mid = row/2+1;
		}
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount==1 &&columCount>1 && columCount<colum || rowCount==row &&columCount>1 && columCount<colum || rowCount==mid &&columCount>1 && columCount<colum)
				{
					System.out.print("* ");
				}
				else if(rowCount<=mid && columCount==1 && rowCount>1 )
				{
					System.out.print("* ");
				}
				else if (rowCount>mid && rowCount<row &&columCount==colum )
				{
					System.out.print("* ");
				}
				else if (rowCount==2 && columCount==colum || rowCount==colum-1 && columCount==1 )
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
		}
	}
public	void patternR()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		int mid;
		if (row%2==0)
		{
			mid = row/2;
		}
		else
		{
			mid = row/2+1;
		}
		int first=mid;
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount==1 && columCount<colum ||rowCount==mid && columCount<colum )
				{
					System.out.print("* ");
				}
				else if(rowCount>1 && rowCount<mid && columCount==1 || rowCount>1 && rowCount<mid && columCount==colum)
				{
					System.out.print("* ");
				}
				else if(rowCount>mid && columCount==1)
				{
					System.out.print("* ");
				}
				else if(rowCount>mid && columCount==first)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
			if(rowCount>mid)
				first++;
		}
	}
public	void patternQ()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		int first =1;
		int mid;
		if (row%2==0)
		{
			mid = row/2;
		}
		else
		{
			mid = row/2+1;
		}
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount>1 && rowCount<row && columCount==1 || rowCount>1 && rowCount<row && columCount==colum )
				{
					System.out.print("* ");
				}
				else if (rowCount==1 && columCount>1 && columCount<colum || rowCount==row && columCount>1 && columCount< colum )
				{
					System.out.print("* ");
				}
				else if(rowCount>=mid && columCount==first && rowCount<row)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			rowCount++;
			System.out.println();
			first++;
		}
	}
public	void patternP()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		int mid;
		if (row%2==0)
		{
			mid = row/2;
		}
		else
		{
			mid = row/2+1;
		}
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount==1 && columCount<colum ||rowCount==mid && columCount<colum )
				{
					System.out.print("* ");
				}
				else if(rowCount>1 && rowCount<mid && columCount==1 || rowCount>1 && rowCount<mid && columCount==colum)
				{
					System.out.print("* ");
				}
				else if(rowCount>mid && columCount==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
		}
	}
public	void patternO()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount>1 && rowCount<row && columCount==1 || rowCount>1 && rowCount<row && columCount==colum )
				{
					System.out.print("* ");
				}
				else if (rowCount==1 && columCount>1 && columCount<colum || rowCount==row && columCount>1 && columCount< colum )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			rowCount++;
			System.out.println();
		}
	}
	void patternN()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int first =1;
		int rowCount=1;
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount<=row && columCount==1 || rowCount<=row && columCount== colum)
				{
					System.out.print("* ");
				}
				else if(rowCount>1&& rowCount<row && columCount==first)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
			first++;
		}
	}
	void patternM()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		int first =2 ;
		int second = colum-1;
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount<=row && columCount==1 ||rowCount<=row && columCount==colum)
				{
					System.out.print("* ");
				}
				
				else if (rowCount>1 && rowCount<=(row/2)&& columCount==first ||rowCount>1 && rowCount<=(row/2)&& columCount== second )
				{
					System.out.print("* ");
				}
				else if (rowCount==(row/2 +1) && columCount==(row/2 +1))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
			if(rowCount>2)
			{
				first++;
				second--;
			}
		}
	}
	void patternL()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount<=row && columCount ==1 ||rowCount==row)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
		}
	}
	void patternK()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row/2+2;
		int rowCount=1;
		int first =3;
		int second =colum;
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount<=row && columCount==1 || columCount==second || rowCount>=(row/2+2)&& columCount==first)
				{
					System.out.print("* ");
				}
//				if (rowCount>row/2+1 && columCount==first)
//				{
//					System.out.print("* ");
//				}

				else
				{
					System.out.print("  ");
				}
				columCount++;
				
			}
			System.out.println();
			second--;
			if(second<1)
			first++;
			rowCount++;
		}
	}
	void patternJ()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount<row && columCount==colum)
				{
					System.out.print("* ");
				}
				else if(rowCount==row-1 && columCount==1)
				{
					System.out.print("* ");
				}
				else if(rowCount==row && columCount>1 && columCount<colum)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
		}
	}
	void patternI()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount==1&& columCount>1 && columCount<colum || rowCount==row && columCount>1 && columCount<colum)
				{
					System.out.print("* ");
				}
				else if (rowCount>1&& columCount==(colum/2+1) || rowCount<row && columCount==(colum/2+1))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
		}
	}
	void patternH()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount==(row/2 +1))
				{
					System.out.print("* ");
				}
				else if (rowCount<(row/2 +1) && columCount==1 || rowCount>(row/2 +1) && columCount==1)
				{
					System.out.print("* ");
				}
				else if (rowCount<(row/2 +1) && columCount==colum || rowCount>(row/2 +1) && columCount==colum)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
			}	
		}
	void patternG()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount==1 && columCount>1 && columCount<colum || rowCount==row && columCount>1 && columCount<colum)
				{
					System.out.print("* ");
				}
				else if (rowCount==(row/2+1) && columCount==1 || rowCount==(row/2+1) && columCount>(colum-3) )
				{
					System.out.print("* ");
				}
				else if (rowCount>1 && rowCount<(row/2 +1)&& columCount==1 || rowCount>(row/2 +1) && rowCount< row && columCount==1 ||rowCount>(row/2 +1) && rowCount< row && columCount==row)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
		}
	}
	void patternF()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		while(rowCount<=row)
		{
			int columCount =1;
			while(columCount<=colum)
			{
				if(rowCount==1)
				{
					System.out.print("* ");
				}
				else if (rowCount!=1 && columCount==1 || rowCount!=(row/2 +1) && columCount==1 )
				{
					System.out.print("* ");
				}
				else if (rowCount==(row/2 +1)&& columCount<row)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
		}
		
	}
	void patternE()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		while(rowCount<=row)
		{
			int columCount =1;
			while(columCount<=colum)
			{
				if(rowCount==1 || rowCount==row)
				{
					System.out.print("* ");
				}
				else if (rowCount==(row/2 +1)&& columCount<row )
				{
					System.out.print("* ");
				}
				else if (rowCount>1 && rowCount<(row/2 +1)&& columCount==1 || rowCount>(row/2 +1) && rowCount<row && columCount==1 )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
		}
	}
	void patternD()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;
		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount==1 && columCount<row || rowCount==row && columCount<row )
				{
					System.out.print("* ");
				}
				else if (rowCount>1 && rowCount<row)
				{
					if(columCount==1 || columCount==colum)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
		}
	}
	void patternC()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int rowCount=1;

		while(rowCount<=row)
		{ 
			int columCount=1;
			while(columCount<=colum)
			{
				if(columCount>1 && columCount<colum && rowCount==1 || rowCount==row && columCount>1 && columCount<colum  )
				{
					System.out.print("* ");
				}
				else if (rowCount==2 && columCount==1  || rowCount==row-1 && columCount==1 )
				{
					System.out.print("* ");
				}
				else if (rowCount==2 && columCount==row  || rowCount==row-1 && columCount==row)
				{
					System.out.print("*");
				}
				else if(rowCount>2 && rowCount<row-1)
				{
					System.out.print("* ");
					columCount= colum+1;
					continue;
				}
				else
				{
					System.out.print("  ");
				}
					
				columCount++;
			}
			System.out.println();
			rowCount++;
		}
	}
	void patternB()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row;
		int firstPoint = 1;
		int secondPoint =row;
		int rowCount =1;

		while(rowCount<=row)
		{
			int columCount=1;
			while(columCount<=colum)
			{
				if(rowCount==1 || rowCount==row || rowCount==(row/2)+1 || columCount==firstPoint )
				{
					System.out.print("* ");
				}
				else if (columCount==secondPoint)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
				columCount++;
			}
			System.out.println();
			rowCount++;
		}
	}
	void patternA()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows ");
		int row  = sobj.nextInt();
		int colum = row*2;
		int firstpoint = colum/2;
		int secondpoint = colum/2;
		int countRow =1;
		
		while(countRow<=row)
		{
			int countColum =1;
			while(countColum<=colum)
			{
				if(countColum==firstpoint || countColum==secondpoint || countRow==((row/2)+1) && countColum>firstpoint && countColum<secondpoint && countColum%2==0 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

				countColum++;
			}
			firstpoint--;
			secondpoint++;
			System.out.println();
			countRow++;
		}
		
	}

}

