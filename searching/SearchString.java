package searching;

public class SearchString {
    public static void main(String[] args) {
        String st = "Janit";
        char t = 'i';
        System.out.println(Search(st, t));
    }

    static boolean Search(String str, char ch) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }

        }
        return false;
    }
}
