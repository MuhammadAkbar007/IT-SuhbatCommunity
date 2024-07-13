package uz.akbar;

/**
 * Counter
 */
public class Counter implements Runnable {

	int count;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 1_000_000; i++) {
				count++;
			}
		}

		System.out.println(Thread.currentThread().getName() + ": " + count);
	}
}
