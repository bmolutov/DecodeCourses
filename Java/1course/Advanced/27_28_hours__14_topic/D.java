import java.util.*;

class Array {
	private int n;
	private int[] arr;

	public Array(int n) {
		this.n = n;
		this.arr = new int[n];
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
	}
	public void print() {
		for(int i = 0; i < n; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}
}
