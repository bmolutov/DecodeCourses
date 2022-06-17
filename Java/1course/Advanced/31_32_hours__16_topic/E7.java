import java.util.*;

public class E7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt(); 
		int cols = in.nextInt();

		// initializing an ArrayList
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		for(int i = 0; i < rows; i++) {
			matrix.add(new ArrayList<Integer>());
		}

		// filling an ArrayList
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				matrix.get(i).add(in.nextInt());
			}
		}
		System.out.println();

		// printing
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.printf("%d ", matrix.get(i).get(j));
			}
			System.out.println();
		}
	}
}
