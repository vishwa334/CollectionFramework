package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i=1;i<=5;i++){
            list.add(i*5);
        }
        System.out.println("Display using Iterator: ");
        Iterator<Integer> itr=list.iterator();
        while (itr.hasNext()){
            Integer ele=itr.next();
            System.out.println(ele);
        }
    }
}
