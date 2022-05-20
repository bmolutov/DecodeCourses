abstract class Person {
    public void study() {}
    public void go() {}
    public void sleep() {}
    public void goToParty() {}
}


class Student {
    private String name;
    private String surname;
    private int id;

    public Student(String newName, String newSurname, int newId) {
        this.name = newName;
        this.surname = newSurname;
        this.id = newId;
    }

    // Getter
    public String getName() {
        return String.format("The student's name is %s", this.name);
    }
    public String getSurname() {
        return this.surname;
    }
    public int getId() {
        return this.id;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
    public void setSurname(String newSurname) {
        this.surname = newSurname;
    }
    public void setId(int newId) {
        if(newId < 100) {
            System.out.println("Invalid value!");
            return;
        }
        this.id = newId;
    }

    public void study() {
        System.out.println("I study 10 hours per day");
    }
    public void go() {
        System.out.println("I usually get my university by bus");
    }
    public void sleep() {
        System.out.println("I sleep 10 hours per day");
    }
    public void goToParty() {
        System.out.println("I don't like parties");
    }
}

public class E2 {
    public static void main(String[] args) {
        Student beka = new Student("Bekzat", "Molutov", 92832);
        System.out.printf("%s\n%s\n%d\n", beka.getName(), beka.getSurname(), beka.getId());
        beka.setId(12);
        beka.study();
        beka.sleep();
        beka.sleep();
        beka.goToParty();
        System.out.println(beka.getId());
    }
}
