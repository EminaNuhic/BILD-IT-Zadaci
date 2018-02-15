import java.util.Scanner;

public class Stednja {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite mjesecni iznos stednje: ");
		double mjesecni_iznos_stednje = unos.nextDouble();
		double mjesecna_kamatna_stopa = 0.00417;
		double stanje = 0;
		System.out.print("Unesite broj mjeseci: ");
		int broj_mjeseci = unos.nextInt();
		for (int i = 0; i < broj_mjeseci; i++) {
			stanje = (mjesecni_iznos_stednje + stanje) * (1 + mjesecna_kamatna_stopa);

		}
		System.out.println("Za " + broj_mjeseci + " mjeseci/a,stanje na vasem racunu ce iznositi " + stanje + " $.");
	}

}
