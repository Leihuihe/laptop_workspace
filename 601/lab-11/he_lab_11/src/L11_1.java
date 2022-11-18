
/*
    L11_1.java -> L11-1
 */

/*

 We'll do Programming Project 12.1 from JF 12, completing the book's 
 	ArrayStack<T> implementation. 
 
 Then we'll add code to L11_1's main() to demonstrate the behavior of 
 	isEmpty(), size(), and toString().
  
*/

public class L11_1 {

	public static void main(String[] args) {

		// demonstrate correct behavior of
		// isEmpty(), size(), toString()

		ArrayStack<Integer> aStack = new ArrayStack<>(3);
		StdOut.println(aStack);
		aStack.push(47);

		StdOut.println(aStack.size());

		aStack.pop();
		StdOut.println(aStack.isEmpty());
		StdOut.println(aStack.size());

		for (int i = 0; i < 10; i++) {
			aStack.push(i);
		}
		StdOut.println(aStack);
	}

}
