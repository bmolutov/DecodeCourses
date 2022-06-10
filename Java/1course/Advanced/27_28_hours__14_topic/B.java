public class Person {
	private String fullName;
	private Integer age;

	public Person() {}
	public Person(String fullName, Integer age) {
		this.fullName = fullName;
		this.age = age;
	}
	public void move(String fullName) {
		System.out.printf("%s talks...");
	}
	public void talk(String fullName) {
		System.out.printf("%s talks...");
	}
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Steve Yang", 19);
	}
}
