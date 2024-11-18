package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<Integer>();
        s.add(10);
        s.add(4);
        s.add(45);
        s.add(99);
        s.add(65);
        System.out.println("Set is: "+s);
    }
}
