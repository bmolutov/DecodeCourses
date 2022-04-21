import java.util.*;

public class A {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       List<Integer> list = new ArrayList<Integer>();
       for(int i = 0; i < n; i++) {
           int k = in.nextInt();
           list.add(k);
       }
       for(int i = 0; i < n; i++) {
           System.out.println(list.get(i));
       }
   } 
}
