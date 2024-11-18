package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<Integer>();
        for(int i=10;i<=50;i+=10){
            list.add(i);
        }
        System.out.println("enter the index value who find it:-");
        int index=sc.nextInt();
       // System.out.println("Element @ Index "+index+" is: "+list.get(index));
//        if(index>=0 && index<list.size()){
//            System.out.println(list.get(index));
//        }else {
//            System.out.println("invalid Index");
//        }


        try{
            System.out.println("Element is :-"+list.get(index));
        }catch (IndexOutOfBoundsException a){
            System.out.println("invalid index");
        }
    }
}
