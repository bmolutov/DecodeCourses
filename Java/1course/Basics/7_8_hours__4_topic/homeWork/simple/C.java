import java.util.*;

public class C {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int[] a = new int[n];
       int[] b = new int[n];
       for(int i = 0; i < n; i++) {
           a[i] = in.nextInt();
       }
       for(int i = 0; i < n; i++) {
           b[i] = in.nextInt();
       }
       for(int i = 0; i < n; i++) {
           System.out.printf("(%d, %d)\n", a[i], b[i]);
       }
    }    
}
