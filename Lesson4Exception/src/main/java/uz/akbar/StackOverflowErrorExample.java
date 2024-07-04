package uz.akbar;

public class StackOverflowErrorExample {
	public static void main(String[] args) {
		b();
	}

	static void a() {
		b();
	}

	static void b() {
		a();
	}
}
