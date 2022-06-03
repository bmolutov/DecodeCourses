public class Test {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = 2;
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}

	}
}
