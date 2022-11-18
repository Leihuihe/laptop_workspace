
/*
 * 
 *   Question.java -> H6-5
 *
 */

public class Question
{

	private String qText;
	private String answerA;
	private String answerB;
	private String answerC;
	private boolean aIsCorrect;
	private boolean bIsCorrect;
	private boolean cIsCorrect;
	
	private char correctAnswer; // oneof A, B, C
	
	public Question(String question, String ansA, String ansB, String ansC, boolean aIsCorrect, boolean bIsCorrect, boolean cIsCorrect)
	{
		this.qText = question;
		this.answerA = ansA;
		this.answerB = ansB;
		this.answerC = ansC;
		this.aIsCorrect = aIsCorrect;
		this.bIsCorrect = bIsCorrect;
		this.cIsCorrect = cIsCorrect;
		
		// finish this
	}
	public Question(String question, String ansA, String ansB, String ansC, char correctAnswer )
	{
		this.qText = question;
		this.answerA = ansA;
		this.answerB = ansB;
		this.answerC = ansC;
		this.correctAnswer = correctAnswer;
		
		// finish this
	}
	
	public int gradeQuestion(boolean aSelected, boolean bSelected, boolean cSelected)
	{
		int result = 0;
		if(this.aIsCorrect==aSelected && this.bIsCorrect==bSelected && this.cIsCorrect==cSelected)
			result++;
		return result;
	}
	
	public int gradeQuestion(char answer)
	{
		int result = 0;
		if(this.correctAnswer==answer)
			result++;
		return result;
	}
	
	public String toString()
	{
		String result = "Question: "+this.qText+"?\n\n";
		result = result+"A: "+this.answerA+"\n";
		result = result+"B: "+this.answerB+"\n";
		result = result+"C: "+this.answerC+"\n";
		return result;
	}
	
	
	public static void main(String[] args)
	{
//		Question question = new Question("Which of the following is a Java type", "int", "Integer", "integer", true, true, false);
//		StdOut.println(question);
//		StdOut.println("Pls. enter your answer(true or false)");
//		StdOut.print("A: ");
//		boolean answerA = StdIn.readBoolean();
//		StdOut.print("B: ");
//		boolean answerB = StdIn.readBoolean();
//		StdOut.print("C: ");
//		boolean answerC = StdIn.readBoolean();
//		int result = question.gradeQuestion(answerA, answerB, answerC);
		Question question = new Question("Which of the following is a Java type", "int", "bool", "integer",'A');
		StdOut.println(question);
		StdOut.println("Pls. enter your answer(A, B or C):");
		char answer = StdIn.readChar();
		int result = question.gradeQuestion(answer);
		StdOut.println("Your grades is: "+result);
	}

}
