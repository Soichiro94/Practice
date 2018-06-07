package exam2016;

/**
 * Created by soich on 05.06.2018.
 */
public class IPP extends Thread {

    public final int N = 5;

    private IPP next;

    public IPP(IPP next) {
        this.next = next;
    }

    public IPP getNext() {
        return next;
    }

    public void setNext(IPP next) {
        this.next = next;
    }
}
