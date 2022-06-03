import java.io.File;


public class E5 {
	public static void main(String[] args) {
		File myfile = new File("test.txt");
		if(myfile.exists()) {
			System.out.println("File name: " + myfile.getName());
			System.out.println("Absolute path: " + myfile.getAbsolutePath());
			System.out.println("Writeable: " + myfile.canWrite());
			System.out.println("Readable: " + myfile.canRead());
			System.out.println("File size in bytes " + myfile.length());
		} else {
			System.out.println("The file does not exist.");
		}
	}
}
