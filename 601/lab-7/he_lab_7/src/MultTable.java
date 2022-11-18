/*
 
 	MultTable.java -> L7.5
 
 */

public class MultTable
{
	private int[][] table;
			
	public MultTable()
	{
		this.table = new int[10][10];
		for(int row=0; row<10; row++)
		{
			for(int col=0; col<10; col++)
			{
				this.table[row][col] = row*col;
			}
		}
		// finish this
	}
	
	public void printTable()
	{
		for(int row=0; row<10; row++)
		{
			StdOut.printf("%2d |",row);
			for(int col=0; col<10; col++)
			{
				StdOut.printf("%3d",this.table[row][col]);
			}
			StdOut.println();
		}
		// finish this
	}

	public static void main(String[] args)
	{
		MultTable table = new MultTable();
		table.printTable();
		// finish this
	}

}
