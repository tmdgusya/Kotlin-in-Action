package Example06;

public class NullableJavaTest {

    public static void main(String[] args) {
        System.out.println(strLen(null));
    }

    public static int strLen(String s) {
        return s.length();
    }
}
