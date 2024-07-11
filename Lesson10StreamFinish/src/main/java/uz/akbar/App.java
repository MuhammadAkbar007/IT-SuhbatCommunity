package uz.akbar;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {

		List<Group> groups = List.of(
				new Group("Java", Set.of(
						new Student("Samandar", 22, 5.0),
						new Student("Avazbek", 23, 4.7),
						new Student("Sirojiddin", 24, 3.9),
						new Student("Jahongir", 20, 4.5))),

				new Group("Python", Set.of(
						new Student("Jasur", 24, 3.0),
						new Student("Javohir", 25, 4.7),
						new Student("Shohjahon", 18, 5.0),
						new Student("Abdulbosit", 19, 3.8),
						new Student("Umidjon", 22, 4.8))),

				new Group("NodeJS", Set.of(
						new Student("Ahror", 20, 3.1),
						new Student("Qobiljon", 25, 4.6),
						new Student("Ibrohim", 24, 4.5)))

		);

		/* Collect group names */
		List<String> groupNames = groups.stream()
				.map(Group::getName)
				.collect(Collectors.toList());

		groupNames.forEach(System.out::println);

		/* Collect all studens from all groups */
		List<Student> allStudentsList = groups.stream()
				.flatMap(group -> group.getStudents().stream())
				.collect(Collectors.toList());

		allStudentsList.forEach(System.out::println);

		/* Collect all points of each student */
		Optional<Double> summary = allStudentsList.stream()
				.map(Student::getMark)
				.reduce((sum, mark) -> sum + mark);

		summary.ifPresent(sum -> System.out.println("Average point is: " + sum));

		/* Getting summary of marks in one stream */
		Double summary2 = groups.stream()
				.flatMap(group -> group.getStudents().stream())
				.map(Student::getMark)
				.reduce(0D, Double::sum);

		System.out.printf("Summary in one stream: %.2f\n", summary2);

		/* Getting summary using for */
		Double summary3 = 0D;
		for (int i = 0; i < groups.size(); i++) {
			for (Student student : groups.get(i).getStudents()) {
				summary3 += student.getMark();
			}
		}

		System.out.printf("Summary using for: %.2f\n", summary3);
	}
}
