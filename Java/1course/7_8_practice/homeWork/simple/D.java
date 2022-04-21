import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] a = new String[n];
        String[] b = new String[n];

        for(int i = 0; i < n; i++) {
            a[i] = in.next();
        }
        for(int i = 0; i < n; i++) {
            b[i] = in.next();
        }

        for(int i = 0; i < n; i++) {
            if(a[i].length() > b[i].length()) {
                System.out.println(a[i]);
            } else {
                System.out.println(b[i]);
            }
        }
    }
}
