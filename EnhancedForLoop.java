package ArrayPack;

public class EnhancedForLoop {

	public static void main(String[] args) {
		int [] num= {1,2,3,4,5,6,7,8,9};
		EnhancedForLoop obj = new EnhancedForLoop();
		obj.printing(num);
	}

	private void printing(int[] num) {
		System.out.println("Printing Elements in the Array Using Enhanced For Loop");
		for(int i:num)
		{
			System.out.print(i+" ");
		}
		
	}

}
