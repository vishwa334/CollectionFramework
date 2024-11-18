package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<Integer>();
        for (int i=10;i<=50;i+=10){
            list.add(i);
        }
        System.out.println("List is "+ list);
        System.out.println("enter the element who update it");
        int ele=sc.nextInt();
        if(list.contains(ele)){
            System.out.println("enter the element who add it ");
            int u=sc.nextInt();

            int loc=list.indexOf(ele);
            list.set(loc,u);
            System.out.println("after update: "+list);
        }
        else {
            System.out.println("no such element in list");
        }
    }
}
