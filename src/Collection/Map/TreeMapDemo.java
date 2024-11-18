package Collection.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new TreeMap<Integer,String>();
        map.put(10,"apple");
        map.put(20,"Mango");
        map.put(30,"banana");
        map.put(40,"orange");
        System.out.println("Map: "+map);
    }
}
