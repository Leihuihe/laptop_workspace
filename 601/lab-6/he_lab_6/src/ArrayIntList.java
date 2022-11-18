
/*
 *   ArrayIntList.java -> L6-1
 * 
 * Part of online JUnit tutorial...
 * 
 * We'll learn about java.util.ArrayList<Integer> later...
 *
 */

import java.util.ArrayList;

public class ArrayIntList
{
	private ArrayList<Integer> alist;

	public ArrayIntList()
	{
		alist = new ArrayList<Integer>();
	}

	public ArrayIntList(int capacity)
	{
		alist = new ArrayList<>(capacity);
	}

	public void add(int toAdd)
	{
		alist.add(toAdd);
	}

	public void add(int toAdd, int atIndex)
	{
		alist.add(atIndex, toAdd);
	}

	public int remove(int toRemove)
	{
		return alist.remove(toRemove);
	}

	public int indexOf(int toFind)
	{
		return alist.indexOf(toFind);
	}

	public boolean isEmpty()
	{
		return alist.isEmpty();
	}

	public boolean contains(int toFind)
	{
		return alist.contains(toFind);
	}

	public int get(int atIndex)
	{
		return alist.get(atIndex);
	}

	public int size()
	{
		return alist.size();
	}

	public String toString()
	{
		return alist.toString();
	}
	
	public double average(int ... anArray)
	{
		double result = 0.0;
		if (anArray.length != 0)
		{
			int sum = 0;
			for (int num : anArray)
			sum += num;
			result = (double)sum / anArray.length;
		}
		return result;
	}
	
	public static int lastElement(int[] anArray)
	{
		return anArray[anArray.length-1];
	}
	
	public static void main(String[] args)
	{
		ArrayIntList aList = new ArrayIntList();
		
		StdOut.println("initial list: " + aList.toString());
//		int [] [] product = new int[4][4];
//		for(int i=0; i<product.length;i++)
//		{
//			for(int j=0; j<product[i].length;j++)
//			{
//				product[i][j] = i*j;
//			}
//		}
//		for(int[] i : product)
//		{
//			for(int j : i)
//			{
//				StdOut.print(j+" ");
//			}
//			StdOut.println();
//		}
//		
//		int[] anArray = {83,85};
//		StdOut.println(aList.average(anArray));
//		StdOut.println(aList.lastElement(anArray));
	}

}
