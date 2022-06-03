import java.io.File;


public class E6 {
	public static void main(String[] args) {
		File myfile = new File("test.txt");
		if(myfile.delete()) {
			System.out.println("Deleted the file: " + myfile.getName());
		} else {
			System.out.println("Failed to delete the file");
		}
	}
}
