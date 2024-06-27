package uz.akbar;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		String str1 = "String";
		String str2 = "String";
		String str3 = "String2";
		String str4 = new String("String2");
		String str5 = new String("String2");

		/* are they equal? */
		System.out.println();
		System.out.println("1 vs 2 => " + (str1 == str2));
		System.out.println("1 vs 3 => " + (str1 == str3));
		System.out.println("1 vs 4 => " + (str1 == str4));
		System.out.println("3 vs 4 => " + (str3 == str4));
		System.out.println("4 vs 5 => " + (str4 == str5));
		System.out.println();

		/* getting memory addresses via identityHashCode */
		System.out.println("str1 id => " + System.identityHashCode(str1));
		System.out.println("str2 id => " + System.identityHashCode(str2));
		System.out.println("str3 id => " + System.identityHashCode(str3));
		System.out.println("str4 id => " + System.identityHashCode(str4));
		System.out.println("str5 id => " + System.identityHashCode(str5));
		System.out.println();

		/*
		 * Integer pool but its range is [-128; 127].
		 * So out of range variables are created as
		 * separate new objects with new different hashCode
		 */
		Integer int1 = 127;
		Integer int2 = 127;
		Integer int3 = 128;
		Integer int4 = 128;
		Integer int5 = 128;
		System.out.println("Int1 id => " + System.identityHashCode(int1));
		System.out.println("Int2 id => " + System.identityHashCode(int2));
		System.out.println("Int3 id => " + System.identityHashCode(int3));
		System.out.println("Int4 id => " + System.identityHashCode(int4));
		System.out.println("Int5 id => " + System.identityHashCode(int5));
		// System.out.println(int3.getClass().getName());

		/* String is immutable */
		System.out.println();
		System.out.println("before => " + str1 + " ~ " + System.identityHashCode(str1));
		str1 = str1.concat("Str");
		System.out.println("after => " + str1 + " ~ " + System.identityHashCode(str1));
		System.out.println();

		/* InputStream strings are located in heap, outside of stringPool */
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: "); // write "test"
		String input = sc.nextLine();
		System.out.println("test" == input); // false
		System.out.println(System.identityHashCode(input));
		System.out.println("test" == input.intern()); // true
		System.out.println(System.identityHashCode(input.intern()));

		sc.close();
		System.out.println();
	}
}
