import java.util.ArrayList;

public class A {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList();

		arr.add("red");
		arr.add("green");
		arr.add("blue");

		for(String color: arr) {
			System.out.printf("%s ", color);
		}
	}
}
