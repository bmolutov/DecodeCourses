class Animal {  
    void eat() {
        System.out.println("eating...");
    }  
}  


class Dog extends Animal {  
    void eat() {
        System.out.println("eating bread...");
    }  
}  


class Cat extends Animal {  
    void eat() {
        System.out.println("eating rat...");
    }  
}  


class Lion extends Animal {  
    void eat() {
        System.out.println("eating meat...");
    }  
} 


public class E3 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Lion lion = new Lion();

        dog.eat();
        cat.eat();
        lion.eat();
    }    
}
