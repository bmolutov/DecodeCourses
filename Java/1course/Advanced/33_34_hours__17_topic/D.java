import java.util.ArrayList;

public class D {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList();

		arr.add(0, 1);
		arr.add(0, 2);
		arr.add(0, 3);

		// 1 2 3 if we use add(element)
		// 3 2 1 if we use add(index, element)

		// we have used overloading method of add()

		arr.set(2, 9);

		for(Integer i: arr) {
			System.out.printf("%d ", i);
		}
	}
}
