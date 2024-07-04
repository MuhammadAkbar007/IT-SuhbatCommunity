package uz.akbar;

public class BitwiseOr {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;

		System.out.println("Before swapping: a = " + a + ", b = " + b);

		// Swapping using bitwise XOR
		a = a ^ b; // a now becomes 15 (binary: 0101 ^ 1010 = 1111)
		b = a ^ b; // b now becomes 5 (binary: 1111 ^ 1010 = 0101)
		a = a ^ b; // a now becomes 10 (binary: 1111 ^ 0101 = 1010)

		System.out.println("After swapping: a = " + a + ", b = " + b);

		/*
		 * First Step: a = a ^ b :
		 * 0101 (binary for 5)
		 * 1010 (binary for 10)
		 * ----
		 * 1111 (result, which is 15 in decimal)
		 */

		/*
		 * Second Step: b = a ^ b :
		 * 1111 (binary for 15)
		 * 1010 (binary for 10)
		 * ----
		 * 0101 (result, which is 5 in decimal)
		 */

		/*
		 * Third Step: a = a ^ b :
		 * 1111 (binary for 15)
		 * 0101 (binary for 5)
		 * ----
		 * 1010 (result, which is 10 in decimal)
		 */
	}
}
