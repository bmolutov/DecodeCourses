class Animal {
    public boolean isAnimal = true;
    public int age = 10;
    public int weight = 5;

    public void run() {
        System.out.println("run...");
    }
    public void sleep() {
        System.out.println("zzz...");
    }
}

class Dog extends Animal {
    public int age = 15;
    public int weight = 10;

    @Override
    public void run() {
        System.out.println("my speed is 20 km/h");
    }
    @Override
    public void sleep() {
        System.out.println("I sleep 10 h/day");
    }
}


public class B {
    
}
