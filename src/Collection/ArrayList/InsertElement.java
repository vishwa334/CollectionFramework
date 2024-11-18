package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<Integer>();
        for (int i=10;i<=50;i+=10){
            list.add(i);
        }
        System.out.println("Before inserting element : "+list);
        System.out.println("enter the location where you want to insert the element:");
        int loc=sc.nextInt();
        if(loc>=0&&loc<list.size()){
            System.out.println("enter the element");
            int ele= sc.nextByte();
            list.add(loc,ele);
            System.out.println("after inserting element the list is:-"+list);
        }else {
            System.out.println("invalid index");
        }

    }
}
