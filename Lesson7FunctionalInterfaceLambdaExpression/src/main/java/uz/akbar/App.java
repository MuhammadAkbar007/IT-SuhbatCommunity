package uz.akbar;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		Operation operation = a -> {
			for (int i = 2; i < Math.sqrt(a); i++) {
				if (a % i == 0)
					return false;
			}
			return true;
		};

		int input = 17;
		System.out.println(operation.isPrime(input) ? (input + " is prime.") : (input + " is not prime."));

		// Comparator Functional Interface
		Integer[] nums = new Integer[] { 2, 35, 67, 12, 7, 89, 8, 15 };
		// Arrays.sort(nums);

		Arrays.sort(nums, (a, b) -> {
			if (a < b)
				return 1;
			if (a > b)
				return -1;
			return 0;
		});
		System.out.println(Arrays.toString(nums));
	}
}
