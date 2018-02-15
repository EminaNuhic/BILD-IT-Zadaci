import java.util.Scanner;

public class ObrnutiRedoslijed {
	public static void redoslijed(int[] niz) {
		for (int i = 9; i >= 0; i--) {
			System.out.print(niz[i] + " ");
		}

	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite 10 brojeva: ");
		int[] niz = new int[10];
		for (int i = 0; i <= 9; i++) {
			int broj = unos.nextInt();
			niz[i] = broj;
		}
		System.out.print("Obrnut redoslijed brojeva: ");
		redoslijed(niz);

	}

}
