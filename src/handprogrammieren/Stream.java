package handprogrammieren;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by soich on 20.06.2018.
 */
public class Stream {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(11);

        System.out.println(numbers);

        List<Integer> list = numbers.stream().map(integer -> integer = integer+2).collect(Collectors.toList());

        System.out.println(list);



    }
}
