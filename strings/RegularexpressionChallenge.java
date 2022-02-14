package strings;

public class RegularexpressionChallenge {
    public static void main(String[] args) {
        int b = 10100101;
        String str1 = String.valueOf(b);
        String str2 = "3738AB";

        System.out.println(str1.matches("[01]*"));
        System.out.println(str2.matches("[0-9A-F]*"));
    }
}
