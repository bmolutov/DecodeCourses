public class E4 {
	public static void main(String[] args) {
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[10]);
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		} finally {
			System.out.println("The 'try catch' is finished.");
		} 
	}
}
