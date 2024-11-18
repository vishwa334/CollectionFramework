package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MergeList {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        for (int i=1;i<=5;i++){
            list1.add(i*5);
        }
        System.out.println("list1 are "+list1);
        List<Integer> list2= new ArrayList<>();
        for (int i=1;i<=5;i++){
            list2.add(i*6);
        }
        System.out.println("list1 are "+list2);

        list1.addAll(list2);
        System.out.println("after merging the list is:"+list1);

    }
}
