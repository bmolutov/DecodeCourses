import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class E4 {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Before formatting: " + dt);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formattedDT = dt.format(formatter);
		System.out.println("After formatting: " + formattedDT);
	}
}
