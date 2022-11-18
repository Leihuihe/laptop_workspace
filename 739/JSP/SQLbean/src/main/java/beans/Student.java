package beans;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
	public double studentNumber;
	
	public boolean booisEligibleToEnroll(Student student)
	{
		return false;
	}
	
	public List<String> getSeminarHistory()
	{
		return new ArrayList<String>();
	}
	
	public void takeExamination()
	{
		
	}

	public double getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(double studentNumber) {
		this.studentNumber = studentNumber;
	}
}
