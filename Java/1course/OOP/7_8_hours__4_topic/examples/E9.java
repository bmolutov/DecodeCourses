class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
    static void print() {
        System.out.println("hey guys!");
    }
}


public class E9 {
    public static void main(String[] args) {
        OuterClass.print();
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y);
    }
}