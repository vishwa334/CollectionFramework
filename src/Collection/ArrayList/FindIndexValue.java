package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindIndexValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<Integer>();
        for (int i=1;i<=5;i++){
            list.add(i);
        }
        System.out.println("List is: "+list);
        System.out.println("enter element to find index value-");
        int ele=sc.nextInt();
        int index=list.indexOf(ele);
        if(index!=-1){
            System.out.println("Index value is :- "+index);
        }
        else {
            System.out.println("No such element in list");
        }
    }
}
