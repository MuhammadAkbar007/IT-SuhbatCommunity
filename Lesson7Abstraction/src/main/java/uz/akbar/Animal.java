package uz.akbar;

/**
 * Animal
 */
public interface Animal {
	int numberOfEyes = 2;

	default void print() {
		System.out.println("This is " + getName());
	}

	private String getName() {
		return "Animal interface";
	}

	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}

	void voice();

	void eat();

	void run();
}
