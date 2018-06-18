package handprogrammieren;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by soich on 18.06.2018.
 */
public class GenericsArrayListTest {

    @Test
    public void print(){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        assertEquals("hello", list.get(0));
    }

    @Test
    public void remove(){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hi");
        list.add("bye");
        assertEquals(3, list.size());
        list.remove("hi");
        assertEquals("bye", list.get(1));
        assertEquals(2, list.size());
    }

    @Test
    public void testremove(){
        List<Integer> list = new ArrayList<>();
        Integer age1 = 20;
        Integer age2 = 20;
        list.add(age1);
        list.add(age2);
        assertEquals(2, list.size());
        list.remove(20);
        assertEquals(2, list.size());
    }
}