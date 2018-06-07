package exam2016;

/**
 * Created by soich on 05.06.2018.
 */
public class MainBound {

    public static void main(String[] args) {

        BoundHashMap bound = new BoundHashMap();

        bound.put("key", "value");
        bound.put("key2", "value2");
        bound.put("key3", "value3");
        bound.put("key4", "value4");
        bound.put("key5", "value5");
        System.out.println(bound);

        bound.put("key6", "value6");
        System.out.println(bound);
    }
}
