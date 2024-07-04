package uz.akbar;

public class App {
	public static void main(String[] args) {
		Human human = new Human("Akbar");
		human.sayName();

		Student student = new Student("Abror", 1);
		student.sayName();
		student.setName("Abi");
		student.setCourseNumber(2);

		Human humanStudent = new Student("Said", 2);
		humanStudent.sayName();
		humanStudent.setName("Sam");
		/* It hasn't courseNumber cause, it was created as humanStudent */
		// humanStudent.setCourseNumber(3);

		/* The following gives compile-time error 👇 */
		// Student studentHuman = new Human("Samandar");
		// studentHuman.sayName();
	}
}
