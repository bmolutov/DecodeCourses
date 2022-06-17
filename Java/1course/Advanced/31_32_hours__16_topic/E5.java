import java.util.ArrayList;

public class E5 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		// using ordinary loop
		for(int i = 0; i < cars.size(); i++) {
			System.out.printf("%s ", cars.get(i));
		}
		System.out.println();

		// using for-each loop
		for(String car: cars) {
			System.out.printf("%s ", car);
		}
	}
}
