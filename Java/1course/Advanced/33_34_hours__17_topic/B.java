import java.util.ArrayList;

public class B {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList();

		arr.add(1);
		arr.add(2);
		arr.add(3);

		for(Integer i: arr) {
			System.out.printf("%d ", i);
		}
	}
}
