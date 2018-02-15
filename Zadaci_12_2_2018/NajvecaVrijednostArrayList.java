import java.util.ArrayList;

public class NajvecaVrijednostArrayList {

	public static Integer max(ArrayList<Integer> list) {
		if (list.isEmpty() || list.size() == 0)
			return null;
		else {

			int max = list.get(0);
			for (int e : list) {
				if (e > max) {
					max = e;
				}
			}

			return max;
		}

	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(5);
		list.add(19);
		list.add(23);
		list.add(1);
		list.add(8);
		list.add(69);
		list.add(4);

		if (max(list) == null) {
			System.out.println("Lista je prazna.");
		} else {
			System.out.println("Najveci clan liste je: " + max(list));
		}
	}

}
