import java.util.ArrayList;

public class F {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList();

		arr.add(0, 1);
		arr.add(0, 2);
		arr.add(0, 3);

		// 1 2 3 if we use add(element)
		// 3 2 1 if we use add(index, element)

		// we have used overloading method of add()

		ArrayList<Integer> another = new ArrayList();
		another.addAll(arr);

		System.out.println("Elements of arr: ");
		for(Integer i: arr) {
			System.out.printf("%d ", i);
		}
		System.out.println("\nElements of another: ");
		for(Integer i: another) {
			System.out.printf("%d ", i);
		}
	}
}
