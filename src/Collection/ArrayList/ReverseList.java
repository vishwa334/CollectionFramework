package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i=4;i<=20;i+=4){
            list.add(i);
        }
        System.out.println("Before reverse List: "+list);
        for (int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
