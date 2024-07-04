package uz.akbar;

public class Student extends Human {
	private int courseNumber;

	public Student(String name, int courseNumber) {
		super(name);
		this.courseNumber = courseNumber;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	@Override
	public void sayName() {
		System.out.println("My courseNumber is " + courseNumber + ". I am Student.");
	}

}
