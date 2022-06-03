import java.io.File;
import java.io.IOException;


public class E2 {
	public static void main(String[] args) {
		try {
			File myFile = new File("new.txt");
			if(myFile.createNewFile()) {
				System.out.println("File created successfully: " + myFile.getName());
			} else {
				System.out.println("File creation failed, it already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred while creating.");
			e.printStackTrace();
		}
	}
}
