
public class Korisnik {
	String imeKorisnika;
	String prezimeKorisnika;
	int idKorisnika;

	Korisnik(String imeKorisnika, String prezimeKorisnika, int idKorisnika) {
		if (idKorisnika <= 0)
			System.out.println("Greska! ID mora biti veci od 0! ");
		else {
			this.imeKorisnika = imeKorisnika;
			this.prezimeKorisnika = prezimeKorisnika;
			this.idKorisnika = idKorisnika;
		}
	}

}