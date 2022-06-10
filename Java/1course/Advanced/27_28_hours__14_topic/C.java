import java.util.*;

class Matrix {
	private int rows;
	private int cols;
	private int[][] matrix;

	public Matrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;

		this.matrix = new int[rows][cols];

		Scanner in = new Scanner(System.in);

		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				this.matrix[i][j] = in.nextInt();
			}
		}
	}
	public void print() {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.printf("%d ", this.matrix[i][j]);
			}
			System.out.println();
		}
	}
}

public class C {
	public static void main(String[] args) {
		Matrix m = new Matrix(3, 3);
		System.out.println();
		m.print();
	}
}

// 1 2 3 
// 3 4 3 
// 9 9 3
