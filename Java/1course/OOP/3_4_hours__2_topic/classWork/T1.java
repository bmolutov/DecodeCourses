public class T1 {
    public static void main(String[] args) {
        System.out.println(Temp.mult(5));
    }    
}

class Temp {
    static int mult(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}