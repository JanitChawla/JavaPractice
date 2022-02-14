package strings;

public class stringchallenge1 {
    public static void main(String[] args) {
        String str1 = "programmer@gmail.com";

        System.out.println(str1.matches("\\w*@gmail(.*)"));

        int len = str1.indexOf('@');
        String str2;
        str2 = str1.substring(0, len);
        System.out.println(str2);
    }
}
