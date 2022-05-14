class Animal {
    public int age = 10;
    public void sound() {
        System.out.println("any sound...");
    }
}

class Tiger extends Animal {
    public int age = 15;
    @Override
    public void sound() {
        System.out.println("roar!!!");
    }
}

public class A {
    public static void main(String[] args) {
        
    }
}