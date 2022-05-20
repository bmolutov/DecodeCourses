public class T1 {
    public static void main(String[] args) {
       int n = 7;
       int m = 8;
       System.out.println(sum(n, m));
    }
    public static String isPrimeCheck(int n) {
       boolean isPrime = true;
       for(int i = 2; i * i <= n; i++) {
           if(n % i == 0) {
               isPrime = false;
           }
       }
       if(isPrime) {
           return "Prime";
       } else {
           return "Not prime";
       }
    }
    public static void Print() {
        System.out.println("hello world!");
    }
    public static boolean isEven(int a) {
        if(a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static int sum(int a, int b) {
        return a + b;
    }
}
