import java.util.*;


class Matrix {
	private int[] arr;
	private int sz;

	public Matrix(int n) {
		this.n = n;
		this.arr = new int[n];

		Scanner in = new Scanner(System.in);
		for(int i = 0; i < this.n; i++) {
			this.arr[i] = in.nextInt();
		}
	}

	public void print() {
		for(int i = 0; i < this.n; i++) {
			System.out.printf("%d ", this.arr[i]);
		}
	}

	public boolean compare(Matrix another) {
		// comparing by length of arrays
		if(this.arr.length > another.arr.length) {
			return true;
		} else {
			return false;
		}
	}
}

public class E {
	public static void main(String[] args) {
		Matrix m1 = new Matrix(3);
		Matrix m2 = new Matrix(2);
		System.out.println(m1.compare(m2));
	}
}
