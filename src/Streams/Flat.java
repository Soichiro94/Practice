package Streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by soich on 15.05.2018.
 */
public class Flat {

    private int size;
    private int price;

    public static void main(String[] args) {

        Flat one = new Flat(50, 500);
        Flat two = new Flat(30, 600);

        Collection<Flat> allList = new ArrayList<>();
        allList.add(one);
        allList.add(two);

        System.out.println(allList);

        Collection<Flat> myList = allList.stream().filter(flat -> flat.getSize() < 40).collect(Collectors.toList());

        System.out.println(myList);




    }

    public Flat(int size, int price) {
        this.size = size;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }
}
