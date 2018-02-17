import java.util.Scanner;

public class Palindrom {
	public static int reverse(int number) {
		int number1 = 0;
		while (number > 0) {
			number1 = number1 * 10;
			number1 += (number % 10);
			number = number / 10;
		}
		return number1;
	}

	public static boolean isPalindrome(int number) {
		if (number == reverse(number))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite broj: ");
		int number = unos.nextInt();
		if (isPalindrome(number)) {
			System.out.println("Broj " + number + " je palindrom!");

		} else {
			System.out.println("Broj " + number + " nije palindrom!");
		}

	}

}
