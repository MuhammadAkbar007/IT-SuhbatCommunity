package uz.akbar;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Stream
 */
public class Stream {

	static Map<Integer, String> birlik = Map.of(
			1, "bir",
			2, "ikki",
			3, "uch",
			4, "to'rt",
			5, "besh",
			6, "olti",
			7, "yetti",
			8, "sakkiz",
			9, "to'qqiz");

	static Map<Integer, String> onlik = Map.of(
			1, "o'n",
			2, "yigirma",
			3, "o'ttiz",
			4, "qirq",
			5, "ellik",
			6, "oltmish",
			7, "yetmish",
			8, "sakson",
			9, "to'qson");

	public static void main(String[] args) {

		List<Integer> numbers = List.of(1, 2, 4, 7, 10, 27, 28, 89, 9, 66, 55);

		List<String> streamWords = numbers.stream()
				.filter(i -> i % 2 == 0)
				.map(Stream::numberToWord)
				.collect(Collectors.toList());

		System.out.println(numbers);
		System.out.println(streamWords);
	}

	public static String numberToWord(int num) {
		String onlik = Stream.onlik.get((num % 100) / 10);
		String birlik = Stream.birlik.get(num % 10);

		return (onlik == null ? "" : onlik + " ") + (birlik == null ? "" : birlik);
	}

}
