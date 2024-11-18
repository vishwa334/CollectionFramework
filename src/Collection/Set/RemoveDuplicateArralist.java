package Collection.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateArralist {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i=1;i<=4;i++)
        {
            list.add(i+3);
            list.add(i+2);
        }
        System.out.println("Duplicate value list is : "+list);
        Set<Integer> set=new HashSet<Integer>(list);
        System.out.println("Set : "+set);

    }
}
