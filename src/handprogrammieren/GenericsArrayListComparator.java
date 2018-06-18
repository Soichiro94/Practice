package handprogrammieren;

import java.util.Comparator;

/**
 * Created by soich on 18.06.2018.
 */
public class GenericsArrayListComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
