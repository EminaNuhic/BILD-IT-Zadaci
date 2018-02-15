import java.util.Scanner;
import java.util.Arrays;

public class SortiranjeRedova {
	public static double[][] sortRows(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			Arrays.sort(array[i]);
		}
		return array;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite broj redova: ");
		int n = unos.nextInt();
		System.out.print("Unesite broj kolona: ");
		int m = unos.nextInt();
		double[][] matrica = new double[n][m];
		System.out.println("Unesite " + n + "x" + m + " matricu: ");
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = unos.nextDouble();
			}
		}

		matrica = sortRows(matrica);

		System.out.println("Sortirana matrica: ");
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
