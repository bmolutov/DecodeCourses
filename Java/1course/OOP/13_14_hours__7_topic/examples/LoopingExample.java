public class LoopingExample {
	public static void main(String[] args) {
		for(Level myVar: Level.values()) {
			System.out.println(myVar);
		}

		System.out.println("#####");

		for(int i = 0; i < Level.values().length; i++) {
			System.out.println(Level.values()[i]);
		}
	}
}
