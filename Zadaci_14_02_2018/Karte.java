
public class Karte {

	public static void main(String[] args) {
		int karta = (int) (Math.random() * 13);
		int znak = (int) (Math.random() * 4);
		switch (karta) {
		case 0:
			System.out.print("Karta koju ste izvukli je A ");
			break;
		case 1:
			System.out.print("Karta koju ste izvukli je 2 ");
			break;
		case 2:
			System.out.print("Karta koju ste izvukli je 3 ");
			break;
		case 3:
			System.out.print("Karta koju ste izvukli je 4 ");
			break;
		case 4:
			System.out.print("Karta koju ste izvukli je 5 ");
			break;
		case 5:
			System.out.print("Karta koju ste izvukli je 6 ");
			break;
		case 6:
			System.out.print("Karta koju ste izvukli je 7 ");
			break;
		case 7:
			System.out.print("Karta koju ste izvukli je 8 ");
			break;
		case 8:
			System.out.print("Karta koju ste izvukli je 9 ");
			break;
		case 9:
			System.out.print("Karta koju ste izvukli je 10 ");
			break;
		case 10:
			System.out.print("Karta koju ste izvukli je J ");
			break;
		case 11:
			System.out.print("Karta koju ste izvukli je Q ");
			break;
		case 12:
			System.out.print("Karta koju ste izvukli je K ");
			break;
		}
		switch (znak) {
		case 1:
			System.out.print("u znaku srca.");
			break;
		case 2:
			System.out.print("u znaku pika.");
			break;
		case 3:
			System.out.print("u znaku djeteline.");
			break;
		case 4:
			System.out.print("u znaku kocke.");
			break;
		}
	}

}
