import java.lang.*;


public class H4 {
	public static void main(String[] args) {
		Integer[] arr = {3, 2, 9, 1};
		System.out.println(max(arr));
	}
	public static <E extends Comparable<E>> E max(E[] list) {
		E ans = list[0];
		for(int i = 1; i < list.length; i++) {
			if(list[i].compareTo(ans) == 1) {
				ans = list[i];
			}
		}
		return ans;
	}
}
