public class AnyWildCardDemo {
	public static void main(String[] args) {
		GenericStack<Integer> intStack = new GenericStack<>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(-2);

		print(intStack);

		GenericStack<String> stringStack = new GenericStack<>();
		stringStack.push("abc");
		stringStack.push("def");
		stringStack.push("den");

		print(stringStack);
	}

	public static void print(GenericStack<?> stack) {
		while(!stack.isEmpty()) {
			System.out.println(stack.pop() + " ");
		}
	}
}
