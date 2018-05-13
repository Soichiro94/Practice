package Comparator;


import java.util.Comparator;

public class MyMapComparator implements Comparator<MyMap>{


    @Override
    public int compare(MyMap o1, MyMap o2) {
        if(o1.getKey() > o2.getKey()) {
            return 1;
        }
        else if(o1.getKey() == o2.getKey()) {
            return 0;
        }
        else {
            return -1;
        }
    }
}