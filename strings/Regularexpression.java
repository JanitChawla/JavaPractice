package strings;

public class Regularexpression {
    public static void main(String[] args) {
        String str1 = "abc";

        System.out.println(str1.matches(".")); // only checks for any single character
        System.out.println(str1.matches("[abc]")); // also checks for single character but among these options
        System.out.println(str1.matches("[^abc]")); // also checks for single character but not among these options
        System.out.println(str1.matches("[a-z0-9]")); // checks for a single character in these range

    }
}
