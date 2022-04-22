import java.util.*;

public class E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int evens = 0, odds = 0;
        for(int i = 0; i < n; i++) {
            int k = in.nextInt();
            evens += (k % 2 == 0) ? k : 0;
            odds += (k % 2 != 0) ? k : 0;
       }
        System.out.println("" + evens + "\n" + odds);
    }    
}
