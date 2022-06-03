import java.io.FileWriter;
import java.io.IOException;


public class E3 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("test.txt");
			fw.write("Files in Java might be tricky, but it is fun enough!");
			fw.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
