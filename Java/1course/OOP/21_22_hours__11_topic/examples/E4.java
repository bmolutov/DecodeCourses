import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class E4 {
	public static void main(String[] args) {
		try {
			File myFile = new File("test.txt");
			Scanner sc = new Scanner(myFile);
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
