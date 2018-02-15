import java.util.Scanner;

public class NizBrojeva {
	public static int max(int[] niz) {
		int max = niz[0];
		for (int e : niz) {

			if (e > max) {
				max = e;
			}
		}
		return max;
	}

	public static int ponavljanje(int[] niz) {
		int brojac = 0;
		for (int e : niz) {
			if (e == max(niz)) {
				brojac++;
			}
		}
		return brojac;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int duzina = unos.nextInt();
		int[] niz = new int[duzina];
		System.out.println("Unesite brojeve (0 prekida unos): ");
		for (int i = 0; i < niz.length; i++) {
			int broj = unos.nextInt();
			if (broj != 0) {
				niz[i] = broj;
			} else {
				break;
			}
		}

		System.out.println("Najveci broj je " + max(niz) + " i ponavlja se " + ponavljanje(niz) + " puta.");
	}
}
