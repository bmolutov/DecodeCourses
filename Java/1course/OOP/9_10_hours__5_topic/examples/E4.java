class Employee {
    float salary = 1000;
}


class GoodEmployee extends Employee {
    float bonus = 200;
    public GoodEmployee() {
        this.salary += bonus;
    }
}


public class E4 {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println("Salary of an ordinary employee: " + e.salary);

        GoodEmployee ge = new GoodEmployee();
        System.out.println("Salary of good employee: " + ge.salary);
    }
}


// GoodEmployee "is A" Employee