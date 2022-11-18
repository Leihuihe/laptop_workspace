/**
 * Lab 4, problem 3
 * 
 */
public class Sum3Ways
{

	public static void main(String[] args)
	{
		int N = StdIn.readInt();
		int sum = 0;
		// print 1+2+...+N using for-loop
		for(int i=1;i <= N;i++)
		{
			sum += i;
		}
		StdOut.println(sum+"\n----------");
		
		// print same using while-loop
		int num = 1;
		sum = 0;
		while(num<=N)
		{
			sum += num;
			num++;
		}
		StdOut.println(sum+"\n----------");
		// print same using do-while-loop
		num = 1;
		sum = 0;
		do
		{
			sum += num;
			num++;
		}
		while(num<=N);
		StdOut.println(sum);
	}
}
