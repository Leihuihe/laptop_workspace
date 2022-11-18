
/*
 	L11_4.java -> L11-4
 
 */

/*
   Add code that reads an entire line from the console as a String (StdOut.readLine()).  
  
   Then use JF 12's ArrayStack<Character> to reverse it character by character and print it out.
   
 */

public class L11_4 {

	public static void main(String[] args) {
		StdOut.print("Enter a String: ");
		String instring = StdIn.readLine();
		StdOut.println("you entered: \"" + instring + "\"");

		ArrayStack sarray = new ArrayStack<Character>();

		for (int i = 0; i < instring.length(); i++) {
			sarray.push(instring.charAt(i));
		}

		StdOut.println(sarray.toString());

		while (!sarray.isEmpty()) {
			char c = (char) sarray.pop();
			StdOut.print(c);
		}
	}

}
