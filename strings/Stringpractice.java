package strings;



public class Stringpractice {
    public static void main(String[] args) {
        String str1= "Janit";

        String str2 = new String("Janit"); // created in heap

        char c[] = {'A', 'B', 'C', 'D'};
        String str3 = new String(c);

        System.out.println(str3);
        

        byte b[] = {65, 66, 67, 68};
        String str4 = new String(b,1,2); // constructor taking parameters can be done with arrays not just byte

        System.out.println(str4);

         String str5="Java";
        //String str2="Java";
        String str6=new String("Java");
        System.out.println(str5==str6); // will result false because its created in heap not in pool

        
    }
}