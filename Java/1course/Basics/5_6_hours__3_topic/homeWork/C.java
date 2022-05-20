import java.math.BigInteger;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        
        BigInteger byteLeft = new BigInteger(String.valueOf((byte)-Math.pow(2, 7)));
        BigInteger byteRight = new BigInteger(String.valueOf((byte)(Math.pow(2, 7)-1)));
        
        BigInteger shortLeft = new BigInteger(String.valueOf((short)-Math.pow(2, 15)));
        BigInteger shortRight = new BigInteger(String.valueOf((short)(Math.pow(2, 15)-1)));
        
        BigInteger intLeft = new BigInteger(String.valueOf((int)-Math.pow(2, 31)));
        BigInteger intRight = new BigInteger(String.valueOf((int)(Math.pow(2, 31)-1)));
        
        BigInteger longLeft = new BigInteger(String.valueOf((long)-Math.pow(2, 63)));
        BigInteger longRight = new BigInteger(String.valueOf((long)(Math.pow(2, 63)-1)));
       
        for(int i = 0; i < n; i++) {
            String s = in.nextLine();
            BigInteger number = new BigInteger(s);
            boolean fitInByte = false;
            if((number.compareTo(byteLeft) == 1 || number.compareTo(byteLeft) == 0) && (number.compareTo(byteRight) == -1 || number.compareTo(byteRight) == 0)) {
               fitInByte = true;
            } 
            boolean fitInShort = false;
            if((number.compareTo(shortLeft) == 1 || number.compareTo(shortLeft) == 0) && (number.compareTo(shortRight) == -1 || number.compareTo(shortRight) == 0)) {
               fitInShort = true;
            }
            boolean fitInInt = false;
            if((number.compareTo(intLeft) == 1 || number.compareTo(intLeft) == 0) && (number.compareTo(intRight) == -1 || number.compareTo(intRight) == 0)) {
               fitInInt = true;
            }
            boolean fitInLong = false;
            if((number.compareTo(longLeft) == 1 || number.compareTo(longLeft) == 0) && (number.compareTo(longRight) == -1 || number.compareTo(longRight) == 0)) {
               fitInLong = true;
            }
            
            if(fitInByte == false && fitInShort == false && fitInInt == false && fitInLong == false) {
                System.out.printf("%s can't be fitted anywhere.\n", number.toString());
                continue;
            }
            
            System.out.printf("%s can be fitted in:\n", number.toString());
            if(fitInByte == true) {
                System.out.println("* byte");
            }
            if(fitInShort == true) {
                System.out.println("* short");
            }
            if(fitInInt == true) {
                System.out.println("* int");
            }
            if(fitInLong == true) {
                System.out.println("* long");
            }
        }
    }
}
