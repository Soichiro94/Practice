package handprogrammieren;

import java.util.ArrayList;

/**
 * Created by soich on 18.06.2018.
 */
public class GenericsArrayList {

    public static void main(String[] args) {

        ArrayList<String> string = new ArrayList<>(5);
        string.add("g");
        string.add("b");
        string.add("h");
        string.add("a");
        System.out.println(string.get(0));
        System.out.println(string.get(1));

        System.out.println(string.toString());

        string.sort(new GenericsArrayListComparator());
        System.out.println(string.toString());
    }
}
