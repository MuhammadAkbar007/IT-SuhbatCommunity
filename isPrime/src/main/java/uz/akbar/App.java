package uz.akbar;

public class App {
	public static void main(String[] args) {

		Operation operation = number -> System.out.println(number + " is prime: " + isPrime(number));

		int[] testNumbers = { 0, 1, 2, 3, 4, 16, 17, 18, 19, 20, 97 };

		for (int number : testNumbers) {
			operation.print(number);
		}

	}

	public static boolean isPrime(int number) {
		// Handle numbers less than 2
		if (number < 2) {
			return false;
		}
		// Handle small prime numbers
		if (number == 2 || number == 3) {
			return true;
		}
		// Eliminate even numbers greater than 2
		if (number % 2 == 0) {
			return false;
		}
		// Check divisibility from 3 to sqrt(number), skipping even numbers
		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
