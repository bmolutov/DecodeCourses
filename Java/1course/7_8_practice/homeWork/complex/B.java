import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        System.out.println(sum(a));
    }    
    public static long sum(long[] arr) {
        long result = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            result += arr[i];
        }
        return result;
    }
}
