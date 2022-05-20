abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}


public class E1 {
    // public abstract void sound();
    public static void main(String[] args) {
        Animal a = new Animal();
    }
}