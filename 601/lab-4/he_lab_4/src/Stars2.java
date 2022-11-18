/**
 * Lab 4, problem 8
 * 
 */
public class Stars2
{

	public static void main(String[] args)
	{
		StdOut.println("Pls. enter an integer N: ");
		int N = StdIn.readInt();	
		for(int i=0;i<N;i++)
		{
			StdOut.print("*");
		}
		StdOut.println("\n----------------------------");
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++) 
			{
				StdOut.print("*");
			}
			StdOut.println();
		}
		StdOut.println("\n----------------------------");
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<=i;j++) 
			{
				StdOut.print("*");
			}
			StdOut.println();
		}
		StdOut.println("\n----------------------------");
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N-i;j++) 
			{
				StdOut.print("*");
			}
			StdOut.println();
		}
		StdOut.println("\n----------------------------");
		/* 
		
		****
		*  *
		*  *
		****

		 */
		for(int i=0;i<N;i++)
		{
			if(i==0 || i==N-1) 
			{
				for(int j=0;j<N;j++)
				{
					StdOut.print("*");
				}
			}
			else
			{
				for(int j=0;j<N;j++) 
				{
					if(j==0 || j==N-1)
					{
						StdOut.print("*");
					}
					else
					{
						StdOut.print(" ");
					}
				}
			}
			StdOut.println();
		}
		StdOut.println("\n----------------------------");
		/* 
		
		*-*- 
		-*-*
		*-*-
		-*-*

		 */
		for(int i=1;i<=N;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=N;j++) 
				{
					if(j%2!=0)
					{
						StdOut.print("*");
					}
					else
					{
						StdOut.print("-");
					}
				}
			}
			else
			{
				for(int j=1;j<=N;j++) 
				{
					if(j%2==0)
					{
						StdOut.print("*");
					}
					else
					{
						StdOut.print("-");
					}
				}
			}
			
			StdOut.println();
		}
	}
}
