
/*
 * 
 *   QuizTime.java -> H6-5
 *
 */

public class QuizTime
{

	public static void main(String[] args)
	{
		// create a Quiz, then populate with 5 multiple-choice questions
		
		// give the Quiz to the user, presenting each question and possible answers,
		//	with the user entering their answer
		
		// report the results: number of correct answers out of number of questions
		Quiz quize = new Quiz();
		Question question1 = new Question("Which of the following is a Java type", "int", "bool", "integer",'A');
		Question question2 = new Question("Which of the following is not a Java type", "int", "bool", "boolean",'B');
		Question question3 = new Question("1 + 1 =", "1", "2", "3",'B');
		Question question4 = new Question("1 + 2 =", "1", "2", "3",'C');
		Question question5 = new Question("1 + 3 =", "1", "2", "4",'C');
		quize.add(question1);
		quize.add(question2);
		quize.add(question3);
		quize.add(question4);
		quize.add(question5);
		quize.giveQuiz();
		StdOut.println("Your grades is: "+quize.getNumCorrect());
	}

}
