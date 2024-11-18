package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i=1;i<=5;i++){
            list.add(i*5);
        }
        ListIterator<Integer> itr=list.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
