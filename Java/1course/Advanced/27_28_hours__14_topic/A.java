public class Phone {
	private Integer number;
	private String model; 
	private Double weight;

	public Phone() {}
	public Phone(Integer number) {
		this.number = number;
	}
	public Phone(Integer number, String model) {
		this.number = number;
		this.model = model;
	}
	public Phone(Integer number, String model, Double weight) {
		this.number = number; 
		this.model = model;
		this.weight = weight;
	}

	public Integer getNumber() {
		return this.number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getWeight() {
		return this.weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public void receiveCall(String name) {
		System.out.printf("%s is calling...", name);
	}
	public void receiveCall(String name, Integer number) {
		System.out.printf("%s is calling... the number is %d", name, number);
	}
	public void sendMessage(String[] args) {
		for(String arg: args) {
			System.out.printf("%s ", arg);
		}
	}

	public static void main(String[] args) {
		Phone p1 = new Phone(1, "a", 1.0);
		Phone p2 = new Phone(2, "b", 2.0);
		Phone p3 = new Phone(3, "c", 3.0);

		System.out.println("" + p1.getName() + p1.getModel() + p1.getWeight());

		System.out.println("" + p2.getName() + p2.getModel() + p2.getWeight());

		System.out.println("" + p3.getName() + p3.getModel() + p3.getWeight());

		p1.receiveCall("Dan");

	}
}
