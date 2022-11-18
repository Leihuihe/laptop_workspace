import java.util.Random;

/*
 * 
 * Answers.java -> L5-2
 *
 */

public class Answers
{
	// here are the 20 possible answers:
	//
//	 It is certain.
//	 It is decidedly so.
//	 Without a doubt.
//	 Yes - definitely.
//	 You may rely upon it.
//	 As I see it, yes.
//	 Most likely.
//	 Outlook good.
//	 Yes.
//	 Signs point to yes.
//	 Reply hazy, try again.
//	 Ask again later.
//	 Better not tell you now.
//	 Cannot predict now.
//	 Concentrate and ask again.
//	 Don't count on it.
//	 My reply is no.
//	 My sources say no.
//	 Outlook not so good.
//	 Very doubtful.

	public static String magicAnswer(int i)
	{
		String toReturn = "";

		// switch? or if-else if-else?
		if(i<0 || i>19) return "???";
		else if(i==0) return "It is certain.";
		else if(i==1) return "It is decidedly so.";
		else if(i==2) return "Without a doubt.";
		else if(i==3) return "Yes - definitely.";
		else if(i==4) return "You may rely upon it.";
		else if(i==5) return "As I see it, yes.";
		else if(i==6) return "Most likely.";
		else if(i==7) return "Outlook good.";
		else if(i==8) return "Yes.";
		else if(i==9) return "Signs point to yes.";
		else if(i==10) return "Reply hazy, try again.";
		else if(i==11) return "Ask again later.";
		else if(i==12) return "Better not tell you now.";
		else if(i==13) return "Cannot predict now.";
		else if(i==14) return "Concentrate and ask again.";
		else if(i==15) return "Don't count on it.";
		else if(i==16) return "My reply is no.";
		else if(i==17) return "My sources say no.";
		else if(i==18) return "Outlook not so good.";
		else if(i==19) return "Very doubtful.";
		return toReturn;
	}

	public static void main(String[] args)
	{
		Random rand = new Random();
		int randInt = rand.nextInt(0, 20); // replace by random int 0..19

		StdOut.println(Answers.magicAnswer(randInt));

	}

}
