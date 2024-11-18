package Collection.Set;

import java.util.Set;
import java.util.*;

public class LinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> s=new java.util.LinkedHashSet<Integer>();
        s.add(20);
        s.add(40);
        s.add(12);
        s.add(12);
        s.add(1);
        s.add(2);
        System.out.println("Set is: "+s);
    }
}
