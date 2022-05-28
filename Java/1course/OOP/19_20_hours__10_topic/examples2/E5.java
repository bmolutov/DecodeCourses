public class E5 {
	public static void main(String[] args) {
		E5 e = new E5();
		e.checkAge(12);
	}
	void checkAge(int age) {
		if(age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		} else {
			System.out.println("Access granted - You are old enough.");
		}
	}
}
