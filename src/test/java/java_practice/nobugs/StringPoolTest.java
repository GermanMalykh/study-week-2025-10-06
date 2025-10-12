package java_practice.nobugs;

public class StringPoolTest {
    public static void main(String[] args) {
        String a = "hello";
        String b = "he" + "llo";
        String c = "he";
        String d = c + "llo";
        String e = new String("hello");
        String f = e.intern();

        System.out.println(a == b);
        System.out.println(a == d);
        System.out.println(a == e);
        System.out.println(a == f);
        System.out.println(d == f);
    }
}
