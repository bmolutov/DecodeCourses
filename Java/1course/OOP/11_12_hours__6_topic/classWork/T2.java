import java.util.*;


public class T2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;

        while(in.nextInt() != 0) {
            int current = in.nextInt();
            if(current < mn) {
                mn = current;
            }
            if(current > mx) {
                mx = current;
            }
        }
        System.out.println("Min value: " + mn);
        System.out.println("Max value: " + mx);
    }    
}
