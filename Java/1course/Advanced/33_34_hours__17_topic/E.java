import java.util.ArrayList;

public class E {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList();

		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(2);
		arr.add(3);

		System.out.printf("First occurrence of 2: %d\n", arr.indexOf(2)); // 1
		System.out.printf("Last occurrence of 2: %d\n", arr.lastIndexOf(2)); // 3
	}
}
