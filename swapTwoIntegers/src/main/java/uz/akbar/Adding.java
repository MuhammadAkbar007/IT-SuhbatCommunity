package uz.akbar;

public class Adding {

	public static void main(String[] args) {
		int a = 2147483647;
		int b = 126;

		// int a = 5;
		// int b = 10;

		System.out.println("before => a=" + a + "; b=" + b + ";");
		a = a + b; // a = 15; b = 10
		b = a - b; // a = 15; b = 5; b is done
		a = a - b; // a = 10; b = 5; a is done
		System.out.println("after => a=" + a + "; b=" + b + ";");

	}
}
