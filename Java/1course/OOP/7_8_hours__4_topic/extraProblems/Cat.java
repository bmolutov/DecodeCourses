public class Cat {
    private String name;    
    private int energy = 1000;

    public Cat(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void run() {
        this.energy -= 100;
    }
    public int getEnergy() {
        return this.energy;
    }
    public void eat() {
        this.energy += 200;
    }
    public void sleep() {
        this.energy += 100;
    }
}
