package Collection.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDeo {
    public static void main(String[] args) {
        Set<Integer> s=new TreeSet<Integer>();
        s.add(20);
        s.add(1);
        s.add(11);
        s.add(3);
        s.add(4);
        s.add(2);
        System.out.println("Tree Set is :"+s);
    }
}
