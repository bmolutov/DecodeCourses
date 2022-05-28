import java.util.*;


public class H2 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(1);
		arr.add(3);
		arr.add(5);
		arr.add(5);
		ArrayList<Integer> res = removeDuplicates(arr);
		for(Integer i: res) {
			System.out.println(i);
		}
	}
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		ArrayList<E> ans = new ArrayList<>();

		for(E obj: list) {
			if(!ans.contains(obj)) {
				ans.add(obj);
			}
		}

		return ans;
	}
}

