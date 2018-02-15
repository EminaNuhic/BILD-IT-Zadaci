import java.util.Scanner;

public class NajveciElement {
	public static int[] locateLargest(double[][] a) {
		double max = a[0][0];
		int[] najveci = new int[2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
					najveci[0] = i;
					najveci[1] = j;
				}
			}
		}
		return najveci;
	}

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.print("Unesite broj redova: ");
		int n=unos.nextInt();
		System.out.print("Unesite broj kolona: ");
		int m=unos.nextInt();
		
		double[][] matrica = new double[n][m];
		

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = unos.nextDouble();
			}
		}
		
		int[] najveci = new int[2];
		
		najveci=locateLargest(matrica);
		
		System.out.println("Lokacija najveceg elementa je: ("+(najveci[0]+1) + " , "+(najveci[1]+1) +")");
	}
		
	}


