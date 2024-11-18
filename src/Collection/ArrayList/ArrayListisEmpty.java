package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListisEmpty {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
//        list.add(20);
//        list.add(40);
//        list.add(50);
//        System.out.println("List is :"+list);
        if(list.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("list is contain element");
        }
    }
}
