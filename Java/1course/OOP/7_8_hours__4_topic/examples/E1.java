class Animal {
    int maxAge = 10;
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}


class Pig extends Animal {
    int maxAge = 4;
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}


class Dog extends Animal {
    int maxAge = 15;
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

public class E1 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();       
    }
}