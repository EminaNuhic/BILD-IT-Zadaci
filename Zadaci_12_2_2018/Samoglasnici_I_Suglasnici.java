import java.util.Scanner;

public class Samoglasnici_I_Suglasnici {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String ime = unos.next();
		unos.close();
		int samoglasnici = 0;
		int suglasnici = 0;
		for (int i = 0; i < ime.length(); i++) {
			char ch = ime.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				samoglasnici++;
			} else if (Character.isLetter(ime.charAt(i))) {
				suglasnici++;
			}
		}
		System.out.println(ime + " ima " + samoglasnici + " samoglasnika i " + suglasnici + " suglasnika.");
	}

}
