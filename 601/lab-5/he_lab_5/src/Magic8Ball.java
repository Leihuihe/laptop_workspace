/*
 * 
 * Magic8Ball.java -> L5-3
 *
 */

import java.util.Random;

public class Magic8Ball
{
	// finish the declaration of instance variables (fields)
	// and methods
	private String lastAnswer;
	
	public Magic8Ball()
	{
		this.lastAnswer = "";
	}
	
	public void randomAnswer()
	{
		Random rand = new Random();
		int randInt = rand.nextInt(0, 20);
		String answer = Answers.magicAnswer(randInt);
		this.lastAnswer = answer;
	}
	public static void main(String[] args)
	{
		Magic8Ball toy = new Magic8Ball();
		
		// finish this
		for(int count = 0; count < 5; count++)
		{
			StdOut.println(toy.getLastAnswer());
		}
	}
	public void run() 
	{
		StdOut.println("Pls. enter a question");
		randomAnswer();
		
	}
	public String getLastAnswer()
	{
		return lastAnswer;
	}

}
