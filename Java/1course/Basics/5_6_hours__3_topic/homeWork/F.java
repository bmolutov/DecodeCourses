import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(s.substring(a, b));
    }
}
