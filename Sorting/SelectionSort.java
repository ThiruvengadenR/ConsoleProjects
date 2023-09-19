package DataStructrueAndAlgorithms.Sorting;

public class SelectionSort {
	
	static int [] selectionSort = {5,1,8,2,4};
	public static void main(String[] args) {
		for(int p1 =0 ; p1<selectionSort.length ;p1++) // N 
		{
			int minIndex =p1;
			for(int p2 =p1 ; p2<selectionSort.length ;p2++) // N-p1
			{
				if(selectionSort[p2]<selectionSort[minIndex])
				{
					minIndex = p2; 
				}
			}
			// swap two variable with using third variable 
			int copy =selectionSort[minIndex];
			selectionSort[minIndex] =selectionSort[p1];
			//System.out.println(selectionSort[minIndex ]+"      min"); 
			selectionSort[p1] = copy;
			//System.out.println(selectionSort[p1 ]+"       p1"); 
		}
		for(int k :selectionSort )
		System.out.print(k+" ");
	}
}

