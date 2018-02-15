import java.util.Scanner;

public class ProstiBrojevi {
	public static void prostiBrojevi(int pocetni, int krajnji, int linija) {
		boolean prost = true;
		int brojac = 1;
		for (int x = pocetni; x <= krajnji; x++) {
			if (x == 1)
				continue;
			prost = true;
			for (int i = 2; i < x && (prost == true); i++) {
				if (x % i == 0)
					prost = false;
			}
			if (prost == true) {
				if (brojac % linija == 0) {
					System.out.println(x + " ");
					brojac++;
					continue;
				}
				System.out.print(x + " ");
				brojac++;
			}
		}

	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite pocetni broj: ");
		int pocetni = unos.nextInt();
		System.out.print("Unesite krajnji broj: ");
		int krajnji = unos.nextInt();
		System.out.print("Unesite koliko brojeva zelite ispisati u jednoj liniji: ");
		int linija = unos.nextInt();
		System.out.println("Prosti brojevi izmedju " + pocetni + " i " + krajnji + " su: ");
		System.out.println();
		prostiBrojevi(pocetni, krajnji, linija);
	}

}
