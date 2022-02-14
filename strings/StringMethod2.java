package strings;

public class StringMethod2 {
    public static void main(String[] args) {
        String str1 = "Learning DSA in Java.";

        System.out.println(str1.startsWith("Learn"));
        System.out.println(str1.startsWith("DSA", 9));
        System.out.println(str1.endsWith("Java."));
        System.out.println(str1.charAt(5));
        System.out.println(str1.indexOf('A'));
    }
}