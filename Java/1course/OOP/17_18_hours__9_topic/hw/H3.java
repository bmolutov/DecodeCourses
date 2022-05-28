public class H3 {
	public static void main(String[] args) {
		Integer[] arr = {1, 2, 4, 9};
		Integer k = 7;
		System.out.println(linearSearch(arr, k));
	}
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		for(int i = 0; i < list.length; i++) {
			if(list[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
}
