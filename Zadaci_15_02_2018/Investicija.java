import java.util.Scanner;

public class Investicija {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite iznos investicije: ");
		double iznosInvesticije = unos.nextDouble();
		System.out.print("Unesite godisnju interesnu stopu: ");
		double godisnjaInteresnaStopa = unos.nextDouble();
		double mjesecnaInteresnaStopa = godisnjaInteresnaStopa / 1200;
		System.out.print("Unesite broj godina:");
		int brojGodina = unos.nextInt();
		double buducaVrijednost = iznosInvesticije * Math.pow((1 + mjesecnaInteresnaStopa), brojGodina * 12);
		System.out.println("Buduca vrijednost investicije je " + buducaVrijednost + ".");

	}

}
