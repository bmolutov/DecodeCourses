import java.util.ArrayList;

public class E4 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		// setting the first element:
		cars.set(0, "Opel");

		// removing the second element:
		cars.remove(1);

		// removing all the elements:
		// cars.clear();
		System.out.println(cars);

		// getting size
		System.out.println(cars.size());
	}
}
