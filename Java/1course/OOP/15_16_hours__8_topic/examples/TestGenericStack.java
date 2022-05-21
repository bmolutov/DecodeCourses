public class TestGenericStack {
	public static void main(String[] args) {
		// Stack that contains only Strings
		GenericStack<String> stack1 = new GenericStack<>();
		stack1.push("London");
		stack1.push("Paris");
		stack1.push("Berlin");
		System.out.println(stack1.toString()); // getting string representation of stack
		System.out.println(stack1.peek()); // getting top element of stack
		while(!stack1.isEmpty()) {
			System.out.println(stack1.pop()); // printing elements by popping its elements
		}

		System.out.println();

		// Stack that contains only Integers
		GenericStack<Integer> stack2 = new GenericStack<>();
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		System.out.println(stack2.toString());
		System.out.println(stack2.peek());
		while(!stack2.isEmpty()) {
			System.out.println(stack2.pop());
		}
	}
}
