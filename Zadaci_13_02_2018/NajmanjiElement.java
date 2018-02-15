import java.util.Scanner;

public class NajmanjiElement {
	public static double min(double[] array) {
		double najmanji = array[0];
		for (int i = 1; i < array.length; i++) {
			if (najmanji > array[i])
				najmanji = array[i];
		}
		return najmanji;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite 10 brojeva: ");
		double[] niz = new double[10];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = unos.nextDouble();

		}
		System.out.println("Najmanji element u nizu je: " + min(niz));
	}
}
