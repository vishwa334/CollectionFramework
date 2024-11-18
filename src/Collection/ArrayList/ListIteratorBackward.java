package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorBackward {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=1;i<=5;i++){
            list.add(i*5);
        }
        ListIterator<Integer> itr=list.listIterator(list.size());
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
