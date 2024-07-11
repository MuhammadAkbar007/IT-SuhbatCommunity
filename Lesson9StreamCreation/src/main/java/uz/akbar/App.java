package uz.akbar;

import java.util.stream.IntStream;

public class App {
	public static void main(String[] args) {
		String str = "Bismillah";
		IntStream chars = str.chars();
		chars
				.mapToObj(c -> (char) c)
				.forEach(System.out::println);

		/* easiest way to print chars as letters */
		// chars.forEach(c -> System.out.println((char) c));
	}
}
