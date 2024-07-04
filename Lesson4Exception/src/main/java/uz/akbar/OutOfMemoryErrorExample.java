package uz.akbar;

import java.util.ArrayList;

public class OutOfMemoryErrorExample {
	public static void main(String[] args) throws InterruptedException {
		String s = "string";
		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < 1_000_000; i++) {
			s += i;
			Thread.sleep(1);
			list.add(s);
		}

		System.out.println(s);
	}
}
