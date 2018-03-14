public class Racun {
	int broj;
	Korisnik korisnik;
	double iznos;

	Racun(int broj, Korisnik korisnik, double iznos) {
		if (broj < 0) {
			System.out.println("Greska: broj racuna mora biti veci od 0!");
		} else if (iznos < 0) {
			System.out.println("Greska: iznos novca ne smije biti manji od 0!");
		} else {
			this.broj = broj;
			this.korisnik = korisnik;
			this.iznos = iznos;
		}
	}
}
