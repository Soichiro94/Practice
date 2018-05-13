package Rekursion;

public class Kit {

    public static void main(String[] args) {
        System.out.println(kitMethod("kitamrofni"));

    }

    static String kitMethod(String s) {
        if (s.length() == 0) {
            return s;
        }
        return kitMethod(s.substring(1)) + s.charAt(0);
    }
}