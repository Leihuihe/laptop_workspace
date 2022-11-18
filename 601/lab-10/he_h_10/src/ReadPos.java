/*
 * 
 * ReadPos.java -> h10-3
 * 
 */

public class ReadPos {

	public static double read_pos_double() throws NumberFormatException, OutOfRangeException {

		StdOut.print("Pls. enter a double value: ");
		double d = Double.parseDouble(StdIn.readLine());
		if (d <= 0.0) {
			throw new OutOfRangeException("Should be > 0.0");
		}
		return d;

	}

	public static void main(String[] args) {
		while (true) {
			try {
				double number = read_pos_double();
				StdOut.println(number);
				break;
			} catch (Exception e) {
				StdOut.println(e.toString());
				StdOut.println("Re-enter");
			}
		}

	}

}
