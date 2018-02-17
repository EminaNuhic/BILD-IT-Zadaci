import java.util.Scanner;

public class NeparnePozicije {
	public static void neparni(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(str.charAt(i) + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite neki string: ");
		String str = unos.nextLine();
		System.out.println("Karakteri na neparnim pozicijama su: ");
		neparni(str);
	}

}
