import java.util.*;


public class T1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // reading
        int n = in.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        // response

        // getting min value
        int mn = a[0];
        for(int i = 0; i < n; i++) {
            // if(a[i] < mn) {
            //     mn = a[i];
            // }
            mn = Math.min(mn, a[i]);
        }

        // getting max value
        int mx = a[0];
        for(int i = 0; i < n; i++) {
            // if(a[i] < mx) {
            //     mx = a[i];
            // }
            mx = Math.max(mx, a[i]);
        }
    }    
}
