public class T3 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Steve Jobs", 50);
		System.out.printf("%s %d%n", p1.getFullName(), p1.getAge());
		System.out.printf("%s %d%n", p2.getFullName(), p2.getAge());
	}
}

class Person {
	private String fullName; 
	private Integer age;

	Person() {
		this.fullName = "Anonymous";
		this.age= 100;
	}
	Person(String fullName, Integer age) {
		this.fullName = fullName;
		this.age = age;
	}

	public String getFullName() {
		return this.fullName;
	}
	public Integer getAge() {
		return this.age;
	}

	public void move() {
		System.out.println("moving...");
	}
	public void talk() {
		System.out.println("talking...");
	}
}
