package Comparator;


import java.util.ArrayList;
import java.util.List;

public class MyMap {

    private int key;
    private String value;

    public MyMap(int key, String value){
        this.key = key;
        this.value = value;
    }

    public static void main(String[] args) {

        List<MyMap> myMap = new ArrayList<>();

        myMap.add(new MyMap(1, "one"));
        myMap.add(new MyMap(9, "nine"));
        myMap.add(new MyMap(4, "four"));


        System.out.println("unsorted map");
        for (MyMap map : myMap) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

        myMap.sort(new MyMapComparator());
        System.out.println();

        System.out.println("sorted map");
        for (MyMap map : myMap) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

    }

    public int getKey() {
        return key;
    }
    
    public String getValue() {
        return value;
    }

}
