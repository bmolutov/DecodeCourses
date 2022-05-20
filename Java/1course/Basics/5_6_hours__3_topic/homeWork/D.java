import java.util.Scanner;

public class D {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = 1;
        while(in.hasNextLine()) {
            System.out.printf("%d %s\n", cnt, in.nextLine());
            cnt++;
        }
    }
}