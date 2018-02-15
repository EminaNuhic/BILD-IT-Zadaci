import java.util.Scanner;

public class Prefiks {
	public static void zajednicki(String s1, String s2) {
		int brojac = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				brojac++;
			} else {
				break;
			}
		}
		if (brojac > 0) {
			System.out.println("Zajednicki prefiks za " + s1 + " i " + s2 + " je: ");
			for (int i = 0; i < brojac; i++) {
				System.out.print(s1.charAt(i));
			}
		} else {
			System.out.println("Stringovi " + s1 + " i " + s2 + " nemaju zajednici prefiks.");
		}
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite prvi string: ");
		String s1 = unos.nextLine();
		System.out.print("Unesite drugi string: ");
		String s2 = unos.nextLine();
		zajednicki(s1, s2);
	}

}
