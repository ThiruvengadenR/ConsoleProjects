package Array2DPack;


public class PraticeProgram {
	static int [][] a = {{1,2,3},{4,5,6}};
	static int [][] b = {{1,2,3},{1,1,1}};
	static int [][] c = {{1,2,1},{1,2,1},{1,2,1}};

	public static void main(String[] args) {
		PraticeProgram obj = new PraticeProgram();
		//obj.addTwoArray(a,b);
		//obj.subTwoArray(a,b);
		//obj.transpose(a);
		//obj.transposeAndCheckBothArrayAreSame(c);
		obj.matrixMultiplication(a,c);
	}

    void matrixMultiplication(int[][] a, int[][] b) {
		if(a[0].length==b.length)
		{
			int [][] c = new int [a.length][b[0].length];
			for(int rowA=0;rowA<a.length;rowA++)
			{
				for(int colB=0;colB<b[0].length;colB++)
				{
					int colA=0;
					int total =0;
					for(int rowB=0;rowB<b.length;rowB++)
						{
//						System.out.println("check flow a " +a[rowA][colA] );
//						System.out.println("check flow b " + b[rowB][colB]);
						total =total+a[rowA][colA]*b[rowB][colB];
						colA++;
						}
					c[rowA][colB]=total;
				}
			}
			SimpleArray.printing2dArray(c);
		}
    
		else
		{
			System.out.println("Given Two array dimensions are not able to mutiple ");
		}
	}

	void transposeAndCheckBothArrayAreSame(int[][] a) {
		 //transpose and check both array are same.
		 int c[][] =  transpose (a);
		// SimpleArray.printing2dArray(c);
		 if(c.length==a.length && c[0].length == a[0].length)
		 {
			boolean flag = false;
			for(int row=0;row<a.length;row++)
			{
				for(int col=0;col<a[0].length;col++)
				{
					if(c[row][col]!=a[row][col])
					{
						flag = true;
					}
				}
				if(flag==true)
				{
					System.out.println("Given array and transpose are same in dimension but element are not same");
				}
			}
			if(flag==false)
			{
				System.out.println("Given array and transpose are same ");
			}
		 }
		 else
		 {
			 System.out.println("Given array and transpose are different in dimension ");
		 }
	}

	int[][] transpose(int[][] a) {
		int c [][] = new int [a[0].length][a.length];
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[0].length;col++)
			{
				c[col][row]=a[row][col];
			}
		}
		//SimpleArray.printing2dArray(c);
		return c;
		
	}

	void subTwoArray(int[][] a, int[][] b) {
		//subtraction of 2d array.
		if(a.length==b.length && a[0].length==b[0].length)
		{
			int c [][] = new int [a.length][a[0].length];
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[0].length;j++)
				{
					c[i][j]=a[i][j]-b[i][j];
				}
			}
			SimpleArray.printing2dArray(c);
		}
	}

	void addTwoArray(int[][] a, int[][] b) {
		//addition of 2d array.
		 if(a.length ==b.length &&  a[0].length == b[0].length)
		 {
			 int c [][]= new int [a.length][a[0].length];
			 for(int i =0;i<a.length;i++)
			 {
				 for(int j =0;j<a[i].length;j++)
				 {
					c[i][j]= a[i][j]+b[i][j];
				 }
			 }
			 SimpleArray.printing2dArray(c);
		 }
		 else
		 {
			 System.out.println("given array mismatch rows and column");
		 }
	}
}
