import java.util.Scanner;

public class DuzinaPiste {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite brzinu pri kojoj avion uzlijece(u m/s): ");
		double v = unos.nextDouble();
		System.out.print("Unesite ubrzanje aviona(u m/s^2): ");
		double a = unos.nextDouble();
		double s = (v * v) / (2 * a);
		System.out.println("Minimalna duzina piste je: " + s + " m.");

	}

}
