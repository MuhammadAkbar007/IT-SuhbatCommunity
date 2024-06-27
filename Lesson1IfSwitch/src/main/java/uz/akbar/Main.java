package uz.akbar;

import java.util.Scanner;

public class Main {

	public static int yuzlik = 0;
	public static int onlik = 0;
	public static int birlik = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		for (;;) {

			System.out.println();
			System.out.println("Chiqish uchun 0 ni kiriting");
			System.out.print("Uch xonali son kiriting: ");
			int num = sc.nextInt();

			if (num == 0) {
				return;
			} else if (num >= 100 && num <= 999) {

				String result;

				yuzlik = num / 100;
				onlik = num % 100 / 10;
				birlik = num % 10;

				result = onlik == 0 && birlik == 0 && yuzlik == 1 ? "Yuz"
						: birlikka(yuzlik) + " yuz " + onlikka(onlik) + " " + birlikka(birlik);

				System.out.println(result);

			} else {
				System.out.println("Son uch xonali bo'lishi kerak!");
			}
			sc.close();
		}

	}

	public static String onlikka(int onlik) {
		switch (onlik) {
			case 0:
				return "";
			case 1:
				return "o'n";
			case 2:
				return "yigirma";
			case 3:
				return "o'ttiz";
			case 4:
				return "qirq";
			case 5:
				return "ellik";
			case 6:
				return "oltmish";
			case 7:
				return "yetmish";
			case 8:
				return "sakson";
			case 9:
				return "to'qson";
			default:
				return "Noto'g'ri raqam";
		}
	}

	public static String birlikka(int birlik) {
		switch (birlik) {
			case 0:
				return "";
			case 1:
				return "bir";
			case 2:
				return "ikki";
			case 3:
				return "uch";
			case 4:
				return "to'rt";
			case 5:
				return "besh";
			case 6:
				return "olti";
			case 7:
				return "yetti";
			case 8:
				return "sakkiz";
			case 9:
				return "to'qqiz";
			default:
				return "Noto'g'ri raqam";
		}
	}
}
