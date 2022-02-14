package strings;

public class StringMethod3 {
    public static void main(String[] args) {
        String str1 = "Amazon";
        String str2 = "Amazon";

        // String str2 = "amazon";
        String str3 = new String("Amazon"); // stored in heap and pool

        String str4 = "Flipkart";
        String str5 = "Flipkart never delivers my stuff";

        System.out.println(str1.equals(str2));
        // System.out.println(str1.equalsIgnoreCase(str2)); ignoring case

        System.out.println(str1.equals(str3)); // this will check the content of the string
        System.out.println(str1 == str3); // this will check the references of the object

        System.out.println(str1.compareTo(str4)); // this will compare the strings dictionary wise
        System.out.println(str1.compareToIgnoreCase(str4)); // this will ignore case and compare the strings dictionary
                                                            // wise

        System.out.println(str5.contains("never"));

    }
}
