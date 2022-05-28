public class H5 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(8);
		arr.add(9);
		shuffle(arr);
		for(Integer i : arr) {
			System.out.println(i);
		}
	}
	public static <E> void shuffle(ArrayList<E> list) {
		for(int i = 0; i < list.size() / 2; i++) {
			E temp = list[i];
			list[i] = list[list.size() - 1];
			list[list.size() - 1] = temp;
		}
		return list;
	}
}
