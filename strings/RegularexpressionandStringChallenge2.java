package strings;

public class RegularexpressionandStringChallenge2 {
    public static void main(String[] args) {
        String str1 = "N!i@c#e$";
        System.out.println(str1.replaceAll("[^a-zA-Z0-9]", ""));

        String str2 = "   Hello    Worl  d    ";
        System.out.println(str2.replaceAll("\\s+", " "));
        String str4 = str2.replaceAll("\\s+", " ").trim();

        String str3[] = str4.split("\\s");
        System.out.println(str3.length);

        String str = "      abc     def     gh   ijk    ";

        str = str.replaceAll("\\s+", " ").trim();

        String words[] = str.split("\\s");

        System.out.println(words.length);

    }
}
