public class E3 {
	public static void main(String[] args) {
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[10]);
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}
	}
}
