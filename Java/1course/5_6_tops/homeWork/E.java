import java.util.Scanner;

public class E {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println((n >= -100 && n <= 100) ? "Good job" : "Wrong answer");
   }
}
