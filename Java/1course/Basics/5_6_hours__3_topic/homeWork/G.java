import java.util.Arrays;
import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.println((isAnagramCheck(a, b) == true) ? "Anagrams" : "Not Anagrams");
    }
    public static boolean isAnagramCheck(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        if(A.length != B.length) {
            return false;
        }
        
        int n = A.length;
        
        for(int i = 0; i < n; i++) {
           if(A[i] != B[i]) {
               return false;
           }
        }
        return true; 
    }
}