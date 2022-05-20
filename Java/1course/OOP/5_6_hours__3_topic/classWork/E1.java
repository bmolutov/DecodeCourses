abstract class Animal {
    protected int age;
    public void sleep() {};
    public void run() {};
}

public class Snake extends Animal {
    private int age;
    public Snake(int newAge) {
        this.age = newAge;
    }
    public void sleep() {
        System.out.println("I sleep 2 hours per day.");
    }
    public void run() {
        System.out.println("My speed is 50km/h.");
    }
}

public class Tiger extends Animal {
    private int age;
    public Tiger(int newAge) {
        this.age = newAge;
    }
    public void sleep() {
        System.out.println("I sleep 4 hours per day.");
    }
    public void run() {
        System.out.println("My speed is 100km/h");
    }
}