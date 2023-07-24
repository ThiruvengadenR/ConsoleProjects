package Array2DPack;

public class SimpleArray {
	static int [][] matrix = {{1,2,3},{3,2,1},{3,4,5}};
	static int [][] matrix1 = {{1,2,3,4,5,6},{3,2,1},{3,4,5,9,7}};
	public static void main(String[] args) {
		SimpleArray obj2D = new SimpleArray();
		//obj2D.printing2dArray(matrix1);
		//obj2D.theSumOfTheRows2dArray(matrix1);
		obj2D.theSumOfTheColum2dArray(matrix1);
		
		
	}
	void theSumOfTheColum2dArray(int[][] matrix) {
		//.print all the sum of the column for the 2 d array.
		// column count only possible for square matrix
		int k=0;
		for(int i = 0 ; i<matrix.length;i++)
		{
			int total =0;
			for(int j = 0 ; j<matrix.length;j++)
			{
				total = total +matrix[j][k];
			}
			System.out.println("sum of the "+i+" cloum "+total);
			k++;
		}
	}
	void theSumOfTheRows2dArray(int[][] matrix) {
		//print all the sum of the rows for the 2 d array.
		for(int i =0;i<matrix.length;i++)
		{
			int total=0;
			for(int j=0;j<matrix[i].length;j++)
			{
				total = total+matrix[i][j];
			}
			System.out.println("Sum of the " +i+" row "+total);
				
		}
		
	}
	static public void printing2dArray(int [] [] matrix) {
		 // print all elements in 2 d array 
		for(int i =0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println();
		}
		
	}


}
