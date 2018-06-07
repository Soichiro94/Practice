package exam2016;

/**
 * Created by soich on 05.06.2018.
 */
public class MainIPP {

    public static void main(String[] args) {

        IPP one = new IPP(null);
        IPP two = new IPP(null);
        IPP three = new IPP(null);

        one.setNext(two);
        two.setNext(three);
        three.setNext(one);

        System.out.println(one.getNext());
        System.out.println(two.getNext());
        System.out.println(three.getNext());

    }
}
