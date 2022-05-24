package strings;

public class StringCompression {

    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        int res = compress(arr);
        System.out.println(res);
    }

    public static int compress(char[] chars) {
        String str = new String(chars);
        char ch = str.charAt(0);
        String str1 = Character.toString(ch);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr == prev) {
                count++;
            } else {
                if (count > 1) {
                    str1 += count;
                    count = 1;
                }
                str1 += curr;

            }
        }
        if (count > 1) {
            str1 += count;
            count = 1;
        }
        System.out.println(str1);
        return str1.length();
    }
}
