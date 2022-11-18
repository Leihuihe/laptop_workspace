/*
 	L11_5.java -> L11-5
 
 */

// Read a String from the user (StdOut.readLine()) that contains left or right parentheses 
//	(skip over any other characters).  
// 
// Then use an ArrayStack<Character> stack to check if the String has a balanced set of parentheses.  
//
// Example: () is balanced, (( is not.

public class L11_5 {

	public static void main(String[] args) {
		String instring = StdIn.readLine();
		ArrayStack<Character> astack = new ArrayStack<>();
		for (int ind = 0; ind < instring.length(); ind++) {
			if (instring.charAt(ind) == '(')
				astack.push(instring.charAt(ind));
			else if (instring.charAt(ind) == ')') {
				if (!astack.isEmpty() && astack.pop() != '(') {
					StdOut.println("Not balanced!");
					return;
				} else {
					StdOut.println("Not balanced!");
					return;
				}
			}
		}

		if (astack.isEmpty()) {
			StdOut.println("Is balanced");
		} else {
			StdOut.println("Not balanced");
		}

	}

}
