package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClearList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        for (int i=10;i<=60;i+=10){
            list.add(i);
        }
        System.out.println("list is : "+list);
        if(list.isEmpty()){
            System.out.println("list is empty");
        }else {
            System.out.println("list is not empty");
            list.clear();
            if(list.isEmpty()){
                System.out.println("list is empty");
            }else {
                System.out.println("list is not empty");
            }
        }


    }
}
