/*
 	L11_6.java -> L11-6
 
 */

/*

Read an entire line from the console as a String that represents a postfix expression, 
	then translate it to an infix expression and print out the result. 
	
	More details in handout...
 */

import java.util.StringTokenizer;

public class L11_6 {

	public static void main(String[] args) {
		String aLine = StdIn.readLine();

		StringTokenizer st = new StringTokenizer(aLine);

		ArrayStack<String> astack = new ArrayStack<>();
		// Implement the pseudocode in the handout:

		// While more tokens (st.hasMoreTokens())
		// Read the next token t (t = st.nextToken())
		// If t is + or – or * or /
		// Pop the top two elements e1 and e2 from the stack
		// Push the expression "(" + e1 + t + e2 + ")"
		// Else push the non-operator t
		//
		// Pop and print the top element of the stack

		while (st.hasMoreTokens()) {
			String t = st.nextToken();

			if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
				String e2 = (String) astack.pop();
				String e1 = (String) astack.pop();

				astack.push("(" + e1 + t + e2 + ")");

			} else {
				astack.push(t);
			}
		}
		StdOut.println(astack.pop());
	}

}
