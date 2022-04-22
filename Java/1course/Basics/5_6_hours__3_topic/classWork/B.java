// Demo of using Scanner and getting input of n numbers

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		// instantiating new scanner
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		// getting input of n numbers
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		// printing array elements
		for(int i = 0; i < n; i++) {
			System.out.printf("arr element: %d\n", arr[i]);
		}
	}
}
