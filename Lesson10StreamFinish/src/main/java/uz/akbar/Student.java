package uz.akbar;

/**
 * Student
 */
public class Student {

	private String name;

	private Integer age;

	private Double mark;

	public Student() {
	}

	public Student(String name, Integer age, Double mark) {
		this.name = name;
		this.age = age;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getMark() {
		return mark;
	}

	public void setMark(Double mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				", mark=" + mark +
				'}';
	}
}
