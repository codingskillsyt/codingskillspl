
public class Array {

	public static void main(String[] args) {
		String name = "Zieba";
		String[] names = new String[3];
		names[0] = "Andrzejewicz";
		names[1] = "Binkowska";
		names[2] = "Cybulska";
		for (String n : names) {
			System.out.println("W tablicy jest: " + n);
		}
		System.out.println("Druga osoba to: " + names[1]);		
		int[] grades = {5, 4, 5};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " ma stopieñ " + grades[i]);
		}
		System.out.println("Czy na liœcie jest Binkowska? " + isInArray(names, "Binkowska"));
		System.out.println("Czy na liœcie jest Cybulski? " + isInArray(names, "Cybulski"));
	}
	
	public static boolean isInArray(String[] array, String name) {
		for (String n : array) {
			if (n.equals(name)) {
				return true;
			}
		}
		return false;
	}
}
