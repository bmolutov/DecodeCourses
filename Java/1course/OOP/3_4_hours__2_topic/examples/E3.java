public class E3 {
    int modelYear;
    String modelName;

    public E3(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        E3 myCar = new E3(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}

// Outputs 1969 Mustang