import java.util.Scanner;

public class PrestupneGodine {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite pocetnu godinu: ");
		int pocetna = unos.nextInt();
		System.out.print("Unesite krajnju godinu: ");
		int krajnja = unos.nextInt();
		int prestupna = 0;
		for (int i = pocetna; i <= krajnja; i++) {
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				prestupna++;

				if (prestupna % 10 == 0) {
					System.out.println(i + " ");
				} else {
					System.out.print(i + " ");
				}
			}
		}

	}

}
