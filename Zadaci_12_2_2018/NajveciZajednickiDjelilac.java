import java.util.Scanner;

public class NajveciZajednickiDjelilac {

	public static int djelilac(int a, int b) {
		if (a > b) {
			int trenutna = b;
			b = a;
			a = trenutna;
		}
		int nzd = 1;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && b % i == 0) {
				nzd = i;
			}
		}
		return nzd;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite dva cijela broja: ");
		int a = unos.nextInt();
		int b = unos.nextInt();
		unos.close();
		System.out.println("Najveci zajednicki djelilac za brojeve " + a + " i " + b + " je " + djelilac(a, b));

	}

}
