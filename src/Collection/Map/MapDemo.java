package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String >();
        map.put(10,"apple");
        map.put(20,"Mango");
        map.put(30,"banana");
        map.put(40,"orange");
        System.out.println("Map: "+map);
    }
}
