import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Racuni {
	public static void kreirajRacun(ArrayList<Racun> racuni) throws IOException {
		System.out.println("Unesite broj novog racuna:");
		Scanner unos = new Scanner(System.in);
		int broj = unos.nextInt();
		unos.nextLine();
		try {
			if (broj < 0) {
				System.out.println("Broj racuna ne smije biti manji od 0!");
			} else if (pronadjiRacun(racuni, broj) == null) {
				System.out.println("Unesite ime vlasnika racuna: ");
				String imeKorisnika = unos.nextLine();
				System.out.println("Unesite prezime vlasnika racuna: ");
				String prezimeKorisnika = unos.nextLine();
				System.out.println("Unesite ID vlasnika racuna: ");
				int idKorisnika = unos.nextInt();
				Korisnik korisnik = new Korisnik(imeKorisnika, prezimeKorisnika, idKorisnika);
				System.out.println("Unesite pocetno stanje racuna: ");
				double novac = unos.nextDouble();
				if (novac < 0) {
					for (int i = 0; i <= 0; i++) {
						System.out.println("Pocetno stanje ne smije biti manje od 0");
						System.out.println("Unesite pocetno stanje racuna: ");
						novac = unos.nextDouble();
					}
					System.out.println("Racun kreiran!");
					Racun novi_racun = new Racun(broj, korisnik, novac);
					racuni.add(novi_racun);
				} else {
					System.out.println("Racun kreiran!");
					Racun novi_racun = new Racun(broj, korisnik, novac);
					racuni.add(novi_racun);
				}
			} else {
				System.out.println("Racun sa brojem " + broj + " vec postoji!");
			}
		} catch (InputMismatchException e) {
			System.err.println("Greska: pogresan unos!");
			unos.nextLine();

		}
	}

	public static void transferNovca(ArrayList<Racun> racuni) throws IOException {
		System.out.println("Unesite broj racuna sa kojeg vrsite transfer:");
		Scanner unos = new Scanner(System.in);
		int source = unos.nextInt();
		Racun source_racun = pronadjiRacun(racuni, source);
		try {
			if (source_racun != null) {
				System.out.println("Unesite broj racuna na kojeg vrsite transfer:");
				int dest = unos.nextInt();
				Racun dest_racun = pronadjiRacun(racuni, dest);
				if (dest_racun != null) {
					System.out.println("Unesite kolicinu novca za transfer:");
					double novac = unos.nextDouble();
					if (source_racun.iznos < novac) {
						System.out.println("Racun broj " + source + " nema dovoljno sredstava za transfer!");
					} else {
						dest_racun.iznos += novac;
						source_racun.iznos -= novac;
						System.out.println("Transfer uspjesan!");
					}
				} else {
					System.out.println("Racun sa brojem " + dest + " ne postoji!");
				}
			} else {
				System.out.println("Racun sa brojem " + source + " ne postoji!");
			}
		} catch (InputMismatchException e) {
			System.err.println("Greska: pogresan unos!");
			unos.nextLine();
		}
	}

	public static void stanjeRacuna(ArrayList<Racun> racuni) throws IOException {
		System.out.println("Unesite broj racuna:");
		Scanner unos = new Scanner(System.in);
		int broj = unos.nextInt();
		Racun racun = pronadjiRacun(racuni, broj);
		try {
			if (racun != null) {
				System.out.println("Broj: " + racun.broj);
				System.out.println("Vlasnik: " + racun.korisnik.imeKorisnika + " " + racun.korisnik.prezimeKorisnika);
				System.out.println("Stanje: " + racun.iznos);
			} else {
				System.out.println("Racun sa brojem " + broj + " ne postoji!");
			}
		} catch (InputMismatchException e) {
			System.err.println("Greska: pogresan unos!");
			unos.nextLine();
		}
	}

	public static Racun pronadjiRacun(ArrayList<Racun> racuni, int broj) {
		for (int i = 0; i < racuni.size(); ++i) {
			if (racuni.get(i).broj == broj)
				return racuni.get(i);
		}

		return null;
	}

	public static void main(String[] args) throws IOException {
		ArrayList<Racun> racuni = new ArrayList<>();
		Scanner unos = new Scanner(System.in);
		String opcija;
		try {
			System.out.println();
			System.out.println("Unesite jednu od opcija:");
			System.out.println("1. Kreiraj novi racun.");
			System.out.println("2. Transfer novca.");
			System.out.println("3. Stanje racuna.");
			System.out.println("0. Izadji.");
			opcija = unos.nextLine();
			if (opcija.equals("0"))
				return;
			else if (opcija.equals("1"))
				kreirajRacun(racuni);
			else if (opcija.equals("2"))
				transferNovca(racuni);
			else if (opcija.equals("3"))
				stanjeRacuna(racuni);
			else
				System.out.println("Greska: nepoznata opcija!");

		} catch (InputMismatchException e) {
			System.err.println("Greska: nepoznata opcija!");
			unos.nextLine();
		}
	}

}
