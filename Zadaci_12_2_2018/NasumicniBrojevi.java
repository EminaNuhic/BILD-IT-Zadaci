
public class NasumicniBrojevi {
	public static void main(String[] args) {

		int[] brojevi = new int[100];
		int[] brojac = new int[100];

		for (int i = 0; i < brojevi.length; i++) {
			int broj = (int) (Math.random() * 10);
			brojevi[i] = broj;
			brojac[broj]++;
		}

		for (int i = 0; i < brojevi.length; i++) {
			System.out.print(brojevi[i] + " ");

		}
		System.out.println();

		for (int i = 0; i < brojevi.length; i++) {

			if (brojac[i] != 0) {
				System.out.println("Broj " + i + " se pojavljuje " + brojac[i] + " puta.");
			}
		}

	}

}
