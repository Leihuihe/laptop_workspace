package beans;

import java.util.List;

public class Professor extends Person{
	public List<Student> listOfStudents;
	public double Salary;
	
	public void applyExamination()
	{
		
	}

	public List<Student> getListOfStudents() {
		return listOfStudents;
	}

	public void setListOfStudents(List<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

}
