import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Wordle
{

	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("popular.txt");
		Scanner sc = new Scanner(file);

		ArrayList<String> all_words = new ArrayList<>();

		while (sc.hasNextLine())
		{
			String nextLine = sc.nextLine();
			if (nextLine.length() == 5)
			{
				all_words.add(nextLine);
			}
		}

		StdOut.println(all_words);
		StdOut.println(all_words.size());
		// pick word

		String word_to_guess; // = 'TENET'

		int randpos = (int) (Math.random() * all_words.size());

		word_to_guess = all_words.get(randpos).toUpperCase();

		StdOut.printf("shh! your word is %s...", word_to_guess);

		// initialize stop flag and number of guesses

		boolean correct_guess = false;
		int num_guesses = 0;

		// keep guessing until correct or 6 incorrect guesses

		while (!correct_guess && num_guesses < 6)
		{
			StdOut.println("Enter your guess #" + (num_guesses + 1));
			String next_guess = StdIn.readLine().toUpperCase();

			// check if next_guess in list of possible words

			if (!all_words.contains(next_guess.toLowerCase()))
			{
				StdOut.println("Not a valid 5-letter word.  Retry:");
				continue;
			}

			// check each letter of guess:
			// correct place => ! (green in online GUI),
			// correct letter but incorrect place => ? (yellow in online GUI)
			// incorrect letter => _ (grey in online GUI)
			//

			String result = ""; // accumulate results

			for (int index = 0; index < word_to_guess.length(); index++)
			{
				if (next_guess.charAt(index) == word_to_guess.charAt(index))
					result += "!";
				else if (word_to_guess.contains(next_guess.charAt(index) + ""))
					result += "?";
				else
					result += "_";
			}

			StdOut.println(result);

			num_guesses += 1;

			if (result.equals("!!!!!"))
				correct_guess = true;
		}

		if (correct_guess)
			StdOut.printf("Correct! You guessed it in %s guesses.  Nice work!", num_guesses);
		else
			StdOut.printf("Wrong! The word was: " + word_to_guess);

	}
}
