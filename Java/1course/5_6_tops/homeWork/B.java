import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        while(q > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int currentSum = a;
            for(int i = 0; i < n; i++) {
                currentSum += Math.pow(2, i) * b;
                System.out.printf("%d ", currentSum);
            }
            System.out.println();
            q--;
        }
    }
}