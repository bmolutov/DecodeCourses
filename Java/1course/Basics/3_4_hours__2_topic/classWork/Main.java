import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int[] temp = {4, 5, 5, 7};

        char[] chs = {'a', 'r', 'd'};

        String[] ss = {"del", "ins"};


//        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
//        System.out.println(Arrays.equals(a, b));
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(chs));

//        System.out.println(ss.length);

        String s = "def";
        s = "abc";
        char[] t = s.toCharArray();
//        System.out.println(Arrays.toString(t));

        String s1 = "abc";
        String s2 = "def";
        String s3 = s1 + s2;
//        System.out.println(s3);

        // Methods of String class
        String teg = "abcDEF234";
//        System.out.println(teg.substring(3));
//        System.out.println(teg.substring(3, 5));
//        System.out.println(teg.replace("bc", "11"));
//        System.out.println(teg.toUpperCase());
//        System.out.println(teg.toLowerCase());
//        System.out.println(teg.contains("DE"));
//        System.out.println(teg.contains("tr"));
//        System.out.println(teg.charAt(0));
//        System.out.println(teg.charAt(6));
//        System.out.println(teg.length());
//        System.out.println(teg.startsWith("rb"));
//        System.out.println(teg.endsWith("34"));

//        StringBuilder ts = new StringBuilder("abcdefcdecde");
//        String nn = ts.toString();
//        ts.setCharAt(0, '1');
//        ts.append("def");
//        ts.insert();
//        ts.delete(1, 4); // [1, 3)

//        System.out.println(ts.indexOf("cde"));
//        System.out.println(ts.indexOf("11"));
//        System.out.println(ts.length());


//        boolean goodWeather = false;
//
//        if(goodWeather == true) {
//            System.out.println("Go out!");
//        } else {
//            System.out.println("Sit indoors!");
//        }

        // && and
        // || or
        // ! not

//        int a = 4;
//        if(a > 0 && a % 2 == 0) {
//            System.out.println("This number is positive and even");
//        } else if (a > 0) {
//            System.out.println("This number is positive");
//        } else if(a < 0) {
//            System.out.println("Negative number");
//        } else {
//            System.out.println("Zero");
//        }

//        int a = 1;
//        switch (a) {
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("two");
//                break;
//            case 3:
//                System.out.println("three");
//                break;
//            default:
//                System.out.println("None of the above numbers!");
//                break;
//        }

//        int i = 0;
//        while(i < 5) {
//            i = i + 1;
//            System.out.println(i);
//        }

//        boolean goodWeather = true;
//        do {
//            goodWeather = false;
//            System.out.println("The weather is good!");
//        } while(goodWeather == true);
//        while() {
//
//        }
//        for(int i = 0; i < 5; i = i + 2) {
//            System.out.println(i);
//        }
//        for(int i = 3; i < 5; i += 2) {
//            System.out.println(i);
//        }
        // long, int
//        for(int counter = 0; counter < 5; counter++) {
//            System.out.println();
//        }
//        for(int i = 0; i <= 10; i++) {
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//        for(int i = 0; i <= 10; i++) {
//            if(i % 2 == 1) {
//                System.out.println(i);
//            }
//        }

//        for(int i = 0; i < 10; i++) {
//            System.out.print("i is equal to: ");
//            if(i == 5) {
//                System.out.println();
//                continue;
//            }
//            System.out.println(i);
//        }

//        outer:
//        for(int i = 0; i < 3; i++) {
//            inner:
//            for(int j = 0; j < 3; j++) {
//                deepest:
//                for(int k = 0; k < 3; k++) {
//                    System.out.println("hello");
//                    if(i == 1 && j == 1) {
//                        break outer;
//                    }
//                }
//            }
//        }

//        System.out.println(5 % 2);
//        System.out.println(4 % 2);
//        int result = 4 % 2;

        // what is the diff. between i++ and ++i?
        // i++ and ++i are the same as i += 1
        int i = 0;
        i--;
        --i;
//        int c = ++i;
        int d = i++;
//        System.out.println("c is equal to: " + c);
        System.out.println("d is equal to: " + d);
    }
}
