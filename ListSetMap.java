import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ListSetMap {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		names.add("Czarek");
		names.add("Marek");
		names.add("Darek");
		names.add("Czarek");
		System.out.println("Uczniowie: ");
		for (String name : names) {
			System.out.println(name);
		}
		HashMap<String, ArrayList<Integer>> grades = new HashMap<>();
		
		ArrayList<Integer> cGrades = new ArrayList<>();
		Collections.addAll(cGrades, 5, 3, 4, 3, 1);
		grades.put("Czarek", cGrades);
		
		ArrayList<Integer> dGrades = new ArrayList<>();
		Collections.addAll(dGrades, 1, 1, 1, 3, 3);
		grades.put("Darek", dGrades);

		ArrayList<Integer> mGrades = new ArrayList<>();
		Collections.addAll(mGrades, 5, 5, 5, 4, 5);
		grades.put("Marek", mGrades);

		System.out.println("Podaj imie");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		scanner.close();
		System.out.println("Oceny dla " + name + ":");
		System.out.println(grades.get(name));
	}
	
	// TODO move adding grades to separate function.

}
