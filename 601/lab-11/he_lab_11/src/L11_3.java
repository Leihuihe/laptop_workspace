import java.lang.reflect.Array;

/*
 	L11_3.java -> L11-3
 
 */
/*
 
 ArrayStack<T> will resize its internal T array (T[]) if it runs out of space.  
 
 Demonstrate this by writing code in LL_3's main() that creates an ArrayStack<Integer> 
 	with initial capacity 3, then push 4 elements. 
 	
 Then print out the new size of the stack.  
 
 How does this compare to the previous capacity of 3?  We'll discuss this in class. 
 
*/

public class L11_3 {

	public static void main(String[] args) {
		// finish this, demonstrating that ArrayStack<> expands
		// its capacity when needed
		ArrayStack<Integer> astack = new ArrayStack<>(3);
		astack.push(32);
		astack.push(18);
		astack.push(22);

		StdOut.println("size: " + astack.size());
		StdOut.println("capacity: " + astack.getCapacity());

		astack.push(22);
		StdOut.println("size: " + astack.size());
		StdOut.println("capacity: " + astack.getCapacity());
		StdOut.println("capacity: " + Array.getLength(astack.stack));
	}

}
