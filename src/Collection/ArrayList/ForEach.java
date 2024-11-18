package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i=1;i<=5;i++){
            list.add(i*5);
        }
        System.out.println("********USING FOR_EACH***********");
        System.out.println("list is ");
        for(Integer x:list){
            System.out.println(x);
        }
        System.out.println("*********USING FOR LOOP**********");
        //it is using for-loop
        System.out.println("List is");
        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
