import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        pr(k);
   }    
    public static int fact(int n) {
        if(n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
    public static void pr(int n) {
        if(n == 0) {
            return;
        } else {
            pr(n - 1);
            System.out.println(n);
        }
    }
}
