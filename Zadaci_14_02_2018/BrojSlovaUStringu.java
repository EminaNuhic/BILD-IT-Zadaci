import java.util.Scanner;

public class BrojSlovaUStringu {

	public static int countLetters(String s) {
		int brojac = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)))
				brojac++;
		}
		return brojac;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite neki string: ");
		String rijec = unos.nextLine();
		System.out.println(rijec + " ima " + countLetters(rijec) + " slova.");

	}

}
