
public class Student implements Comparable<Student>
{
	private String _name;
	private double _gpa;

	public Student(String name, double gpa)
	{
		_name = name;
		_gpa = gpa;
	}

	public int compareTo(Student student)
	{
		if (this._gpa < student._gpa)
			return -1;
		else if (this._gpa > student._gpa)
			return +1;
		else
			return 0;
	}

	public String toString()
	{
		return "(" + _name + "," + _gpa + ")";
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Student s1 = new Student("Eric", 3.47);

		StdOut.println(s1);

	}

}
