public class Primitives {
    public static void main(String[] args) {

        // numbers
        int a = 5; // integer
        float f = 2.5F; // number with floating point
        double d = 2.3; // number with floating point with double precision
        System.out.println("integer -> " + a); // we can concatenate string with int in this case

        // for logic, booleans
        boolean flag1 = true; // boolean
        boolean flag2 = false; // boolean
        boolean result1 = 1 < 10; // true
        boolean result2 = 2 > 3; // false
        System.out.println("boolean -> " + flag1); // we can concatenate string with boolean

        // variable of String reference type
        String s = "hello\tworld";
        System.out.println("string -> " + s); // concatenating two strings

        // characters
        char ch = 'k';
        // basic char representation
        System.out.println("char -> " + ch); // concatenating string with char variable

        // getting chars from unicode table
        char uni1 = '\u00F0';
        char uni2 = '\u00F1';
        char uni3 = '\u00F2';
        // actually it won't appear
        // because here we are needed external encoder
        System.out.println("Unicode -> " + uni1); // attempting to print unicode char

        // getting chars by ASCII
        char ascii1 = 65;
        char ascii2 = 66;
        char ascii3 = 67;
        // using ASCII chars is most common
        System.out.println("ASCII -> " + (char) ascii1);
        
    }
}
