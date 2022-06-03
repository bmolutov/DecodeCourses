import java.util.*;

public class T1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		int n = in.nextInt();
		int[][] arr1 = new int[n][n];
		int[][] arr2 = new int[n][n];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr1[i][j] = in.nextInt();
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr2[i][j] = in.nextInt();
			}
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%d ", arr1[i][j] + arr2[i][j]);
			}
			System.out.println();
		}
	}
}
