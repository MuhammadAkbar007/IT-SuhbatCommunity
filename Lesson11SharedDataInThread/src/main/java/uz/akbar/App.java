package uz.akbar;

public class App {
	public static void main(String[] args) {
		Counter counter = new Counter();

		Thread thread = new Thread(counter, "first");
		Thread thread2 = new Thread(counter, "second");
		Thread thread3 = new Thread(counter, "third");

		thread.start();
		thread2.start();
		thread3.start();
	}
}
