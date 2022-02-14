package strings;

public class StringmatchingandRegular {
    public static void main(String[] args) {
        // String str1 = "abc sasa";
        // System.out.println(str1.matches(".*")); // checks every character for every
        // type like space as well
        // System.out.println(str1.matches("[a-z]"));
        /*
         * String str1="abcdef";//ab6cdef,abBcdef
         * System.out.println(str1.matches("[abc]*"));
         */

        /*
         * String str1="accbdefg";//accb
         * System.out.println(str1.matches("[abc]{3,7}"));
         */

        String str1 = "john@gmail.com";
        // System.out.println(str1.matches(".*gmail.*"));
        System.out.println(str1.matches("\\w*@gmail(.*)"));
    }
}
