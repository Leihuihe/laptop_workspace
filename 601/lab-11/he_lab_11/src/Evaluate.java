
/******************************************************************************
 *  Compilation:  javac Evaluate.java
 *  Execution:    java Evaluate
 *  Dependencies: Stack.java
 *
 *  Evaluates (fully parenthesized) arithmetic expressions using
 *  Dijkstra's two-stack algorithm.
 *
 *  % java Evaluate 
 *  ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) ) 
 *  101.0 
 *
 *  % java Evaluate
 *  ( ( 1 + sqrt ( 5 ) ) / 2.0 ) 
 *  1.618033988749895
 *
 *
 *
 *  Remarkably, Dijkstra's algorithm computes the same
 *  answer if we put each operator *after* its two operands
 *  instead of *between* them.
 *
 *  % java Evaluate
 *  ( 1 ( ( 2 3 + ) ( 4 5 * ) * ) + ) 
 *  101.0
 *
 *  Moreover, in such expressions, all parentheses are redundant!
 *  Removing them yields an expression known as a postfix expression.
 *  1 2 3 + 4 5 * * + 
 * 
 *
 ******************************************************************************/

import java.util.Scanner;
import java.util.Stack;

public class Evaluate {
	public static void main(String[] args) {
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		Scanner scan = new Scanner(System.in);
		// while (!StdIn.isEmpty())
		while (scan.next() == "#") // signal with CTRL-D (Mac) or CTRL-Z (Win)
		{
			// String s = StdIn.readString();
			String s = scan.next();
			// StdOut.println(s);
			// StdOut.println('*');

			if (s.equals("("))
				;
			else if (s.equals("+"))
				ops.push(s);
			else if (s.equals("-"))
				ops.push(s);
			else if (s.equals("*"))
				ops.push(s);
			else if (s.equals("/"))
				ops.push(s);
			else if (s.equals("sqrt"))
				ops.push(s);
			else if (s.equals(")")) {
				String op = ops.pop();
				double v = vals.pop();
				if (op.equals("+"))
					v = vals.pop() + v;
				else if (op.equals("-"))
					v = vals.pop() - v;
				else if (op.equals("*"))
					v = vals.pop() * v;
				else if (op.equals("/"))
					v = vals.pop() / v;
				else if (op.equals("sqrt"))
					v = Math.sqrt(v);
				vals.push(v);
			} else
				vals.push(Double.parseDouble(s));
		}
		StdOut.println(vals.pop());
	}
}
