package DataStructrueAndAlgorithms.Sorting;

public class InsertionSort {
	static int [] insertionSort = {5,1,3,2,4};
	public static void main(String[] args) {
		for(int p1 =0 ; p1<insertionSort.length-1;p1++)
		{
			int p2 = p1+1;
			if(insertionSort[p1]>insertionSort[p2])
			{
				int copy = insertionSort[p1];
				insertionSort[p1]=insertionSort[p2];
				insertionSort[p2]= copy;
				while(p1>0)
				{
					p1--;
					int p21 = p1+1;
					if(insertionSort[p1]>insertionSort[p21])
					{
						int copy1 = insertionSort[p1];
						insertionSort[p1]=insertionSort[p21];
						insertionSort[p21]= copy1;
					System.out.println();
					System.out.println(p1+" p1");
				}
			}
				System.out.println("try output ");
				for(int k : insertionSort)
				{
					System.out.print(k+" ");
				}
		}

	}
		System.out.println("Final output ");
		for(int k : insertionSort)
		{
			System.out.print(k+" ");
		}
}
}


	


