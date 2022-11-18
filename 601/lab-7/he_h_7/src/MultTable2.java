/*	
 	MultTable2.java -> H7-2	
 */

public class MultTable2
{
	private int[][] table;
	
	public MultTable2 ()
	{
		this.table = new int[10][10];
		for (int row=0; row < 10; row++)
			for (int col=0; col < 10; col++)
				table[row][col]=row*col;
	}
	
	public void printFormatted()
	{
	 /* suggested order of implementation:
	   
	    - print only the table numbers, as in the Lab
	    - add first header line
	    - add second line of ----...----
	    - at start of each table line, print row number + |
	    
	  */
		StdOut.printf("%2s |",'*');
		for(int col=0; col<this.table[0].length; col++)
		{
			StdOut.printf("%3d",col);
		}
		StdOut.println();
		StdOut.println("----------------------------------");
		for(int row=0; row<10; row++)
		{
			StdOut.printf("%2d |",row);
			for(int col=0; col<10; col++)
			{
				StdOut.printf("%3d",this.table[row][col]);
			}
			StdOut.println();
		}
	}
			
	public static void main(String[] args)
	{
		MultTable2 t = new MultTable2();
		t.printFormatted();

	}

}
