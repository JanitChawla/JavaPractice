package strings;

public class StringMethods {
    public static void main(String[] args) {

        String str = new String("Hello");
        String str1 = new String("        Hello        ");

        int len = str.length();

        System.out.println(str.charAt(3));

        System.out.println(len);
        System.out.println(str1.trim());
        System.out.println(str.substring(2, 5));
        System.out.println(str.toUpperCase());

    }
}
