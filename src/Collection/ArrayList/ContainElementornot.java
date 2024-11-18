package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContainElementornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 10; i <= 50; i+=10) {
            list.add(i);
        }
        System.out.println("list is "+list);
        System.out.println("enter the element who you find it:-");
        int ele= sc.nextInt();
        if(list.contains(ele)){
            System.out.println("yes element is availabe");
        }
        else {
            System.out.println("no Element is no available ");
        }
    }
}
