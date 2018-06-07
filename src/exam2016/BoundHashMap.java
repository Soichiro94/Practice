package exam2016;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by soich on 05.06.2018.
 */
public class BoundHashMap extends HashMap {

    public static final int MAX = 5;
    public List<Object> counter = new ArrayList<>();


    @Override
    public Object put(Object key, Object value) {
        counter.add(key);
        if(super.size() < MAX){
            return super.put(key, value);
        }
        else{
            remove(counter.get(0));
            counter.remove(0);
            return super.put(key, value);
        }
    }

    @Override
    public Object remove(Object key) {
        return super.remove(key);
    }
}
