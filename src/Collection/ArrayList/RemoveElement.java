package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<Integer>();
        for (int i=10;i<=50;i+=10){
            list.add(i);
        }
        System.out.println("list is "+list);
        System.out.println("enter the index to remove");
        int loc= sc.nextInt();
        if(loc>=0&&loc<list.size()){
            list.remove(loc);
            System.out.println("after deleting element: "+list);
        }else
        {
            System.out.println("Error: no such index to remove");
        }
    }
}
