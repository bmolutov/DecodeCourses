import java.util.*;

public class E6 {
	public static void main(String[] args) {
		Date d1 = new Date(2000, 11, 21);
		Date d2 = new Date();
		Date d3 = new Date(2010, 1, 3);

		boolean a = d3.after(d1);
		System.out.println("Date d3 comes after date d1: " + a);

		boolean b = d3.before(d2);
		System.out.println("Date d3 comes before date d2 " + b);

		int c = d1.compareTo(d2);
		System.out.println(c);

		System.out.println("Milliseconds from Jan 1 1970 to date d1 is " + d1.getTime());

		System.out.println("Before setting " + d2);
		d2.setTime(292392932939L);
		System.out.println("After setting " + d2);
	}
}
