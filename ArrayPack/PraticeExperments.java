package ArrayPack;

public class PraticeExperments {
	static int [] table = new int[5];
	PraticeExperments(int table)
	{
		for(int i=0;i<this.table.length;i++)
		{
			this.table[i]=table;
			table=table+2;
		}
		System.out.println("Before Reversing");
		for(int i=0;i<this.table.length;i++)
		{
			System.out.print(this.table[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		PraticeExperments tables2 = new PraticeExperments(2);
		tables2.reversePrint(table);
		
	}
	private void reversePrint(int[] table2) {
		System.out.println("After Reversing");
		for(int i=0;i<table.length;i++)
		{
			System.out.print(table[(table.length-1)-i]+" ");
		}
		
	}

}
