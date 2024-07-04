package uz.akbar;

/**
 * Human
 */
public class Human {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayName() {
		System.out.printf("My name is %s. I am human.\n", this.name);
	}

	public Human(String name) {
		this.name = name;
	}

}
