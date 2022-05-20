class Calculator {
    int getSum() {
        return 0;
    }
    int getSum(int a, int b) {
        return a + b;
    }
    // overloading method getSum
    int getSum(int a, int b, int c) {
        return a + b + c;
    }
}


class SuperCalculator extends Calculator {
    @Override
    int getSum() {
        return 1;
    }
    @Override // overriding
    int getSum(int a, int b) {
        return (a * a) + (b * b);
    }
    @Override
    int getSum(int a, int b, int c) {
        return (a * a) + (b * b) + (c * c);
    }
}


public class E6 {
    public static void main(String[] args) {
        
    }    
}
