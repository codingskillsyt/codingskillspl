import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// podaj nazwe pliku
		// wypisz zawartosc tegoz
		BufferedReader reader = null;
		Scanner scanner = new Scanner(System.in);
		while (reader == null) {
			System.out.println("Podaj nazwê pliku, u¿ytkowniku!");
			String filename = scanner.nextLine();
			try {
				reader = new BufferedReader(new FileReader(filename));
				String line = null;
				while((line=reader.readLine()) != null) {
					System.out.println(line);
				}
				reader.close();
			} catch (FileNotFoundException e) {
				System.out.println("Poda³eœ nieprawid³ow¹ nazwê pliku!");
			}			
		}
		scanner.close();
	}

}
