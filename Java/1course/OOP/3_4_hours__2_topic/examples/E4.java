public class E4 {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        E4 myObj = new E4();
        myObj.x = 50; // will generate an error: cannot assign a value to a final variable
        myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
    }
}