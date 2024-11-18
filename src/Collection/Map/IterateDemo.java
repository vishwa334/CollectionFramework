package Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IterateDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(10,"ram");
        map.put(20,"sohan");
        map.put(30,"vishwa");
        map.put(40,"rohan");

        System.out.println("Map :"+map);

        Set<Integer> key=map.keySet();
        for (Integer x:key){
            String value=map.get(x);
            System.out.println(x+" "+value);

        }
    }
}
