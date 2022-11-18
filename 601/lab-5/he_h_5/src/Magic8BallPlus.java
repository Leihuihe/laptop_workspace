import java.util.Random;

/*
 * 
 * Magic8BallPlus.java -> H5-2
 *
 */

/*
 
Modify your Magic8Ball.java of Lab 5 as Magic8BallPlus.java by doing the following:
 
(a) Add an accessor (getter) method named public String getLastAnswer(), 
	which returns the current value of field lastAnswer;
	 
(b) Change randomAnswer() so it does not return a value, but just saves 
	the answer into lastAnswer;
	
(c) Add the instance method public void run(), which asks the user to 
	enter a question, then calls randomAnswer(), followed by printing the 
	value returned by getLastAnswer();
	
(d) Change main() so it calls run() on the created instance.

*/

// Don't forget to add your Answers.java class from Lab 5, since
//	Magic8Ball.java depends on it

public class Magic8BallPlus
{
private String lastAnswer;
	
	public Magic8BallPlus()
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
	
	public void run() 
	{
		StdOut.println("Pls. enter a question");
		String question = StdIn.readLine();
		randomAnswer();
		StdOut.println(getLastAnswer());
		
	}
	public String getLastAnswer()
	{
		return lastAnswer;
	}

	public static void main(String[] args)
	{
		Magic8BallPlus ball = new Magic8BallPlus();
		ball.run();
	}

}
