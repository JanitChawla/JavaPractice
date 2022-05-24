package methods;

public class VarArgs {

    static void Args(int... A) {
        for (int x : A) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Args(12, 34, 4343, 12, 19);
    }
}
