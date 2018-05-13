package CollectionList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


        LinkedList<Integer> link = new LinkedList<>();
        ArrayList<Integer> array = new ArrayList<>();

        link.add(1);
        link.add(1);
        System.out.println(link);

        array.add(2);
        array.add(2);
        System.out.println(array);
    }
}
