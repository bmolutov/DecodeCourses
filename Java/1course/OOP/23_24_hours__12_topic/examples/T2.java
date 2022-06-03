import java.util.*;

public class T2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		print((int)Math.min(a, b), (int)Math.max(a, b));
	}
	public static void print(int a, int b) {
		if(a == b + 1) {
			return;
		}
		System.out.printf("%d ", b);
		print(a, b - 1);
	}
}
