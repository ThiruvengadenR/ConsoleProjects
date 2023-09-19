package DataStructrueAndAlgorithms.Sorting;

public class BubbleSort {
	static int [] bubbleSort = {5,8,-1,10,1,3};
	public static void main(String[] args) {
		int count1 =0;
		int lastelement = 0;
		for(int i=0 ;i<bubbleSort.length-lastelement ;i++)
		{
			int count =0 ;
			for(int p1 =0;p1<bubbleSort.length-lastelement ;p1++)
			{
				int p2 = p1+1;
				if(bubbleSort[p1]>bubbleSort[p2])
				{
					// SWAP
					int copy = bubbleSort[p1];
					bubbleSort[p1]=bubbleSort[p2];
					bubbleSort[p2]= copy;
					count++;
				}
				count1++;
				System.out.println("During Sorting ");
				for(int k :bubbleSort )
					System.out.print(k + " ");
				System.out.println( " ------------ " + count1 );
			}
			lastelement++;
			if(count==0)
			{
				break;
			}
		}
		System.out.println("Final copy ");
		for(int k :bubbleSort )
			System.out.print(k+" ");
		
	}


}
