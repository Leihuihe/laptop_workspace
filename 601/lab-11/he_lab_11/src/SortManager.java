/*
 
    L11_2.java -> L11-2
    
 */

public class SortManager<T> // extends Comparable<T>> // => causes runtime error?
							// Demo in class...
{
	private T[] eltsToSort;
	private int numElements = 0;

	@SuppressWarnings("unchecked") // suppresses class cast warning
	public SortManager(int capacity) {
		// things I tried:

		// T foo = (T) new Object();
		// Class clazz = foo.getClass();

		// eltsToSort = (T[])Array.newInstance(clazz, capacity);

		// eltsToSort = new T[capacity]; // this doesn't work!

		eltsToSort = (T[]) new Object[capacity];

	}

	public void addElement(T toAdd) {
		// add toAdd to internal array eltsToSort

		eltsToSort[numElements] = toAdd;
		numElements++;

		// complete this!

	}

	@SuppressWarnings("unchecked")
	public void sort() {
		// sort eltsToSort using exchange or 'bubble sort'

		boolean noMoreSwaps = false;

		while (!noMoreSwaps) {
			noMoreSwaps = true;

			for (int index = 0; index < numElements - 1; index++) {
				// note the cast of elt1 to Comparable<T>:
				// we'll discuss this in class

				T elt1 = eltsToSort[index];
				T elt2 = eltsToSort[index + 1];

				if (((Comparable<T>) elt1).compareTo(elt2) > 0) {
					// swap the elements

					T temp = eltsToSort[index];
					eltsToSort[index] = eltsToSort[index + 1];
					eltsToSort[index + 1] = temp;

					noMoreSwaps = false;
				}
			}
		}
	}

	public void printElts() {
		for (int index = 0; index < numElements; index++) {
			StdOut.print(eltsToSort[index] + " ");
		}

		StdOut.println();
	}

	public static void main(String[] args) {
		// not used
	}

}
