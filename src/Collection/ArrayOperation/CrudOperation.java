package Collection.ArrayOperation;

import java.util.*;

public class CrudOperation {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1. Append");
            System.out.println("2. Insert");
            System.out.println("3. Replace");
            System.out.println("4. Display");
            System.out.println("5. Sort");
            System.out.println("6. Reverse");
            System.out.println("7. Remove");
            System.out.println("8. Quit");
            System.out.print("Enter your choice:-");
            int ch=sc.nextInt();

            if(ch==1){
                System.out.print("enter the element who want to add:-");
                int ele=sc.nextInt();
                list.add(ele);
                System.out.println("element added");
            }
            else if(ch==2){
                System.out.print("enter the index where you want to add element:-");
                int index=sc.nextInt();
                if(index>=0 && index<=list.size()-1){
                    System.out.print("enter the element who want to addd:");
                    int ele=sc.nextInt();
                    list.add(index,ele);
                    System.out.println("element inserted");

                }else {
                    System.out.println("No such element location");
                }
            }
            else if(ch==3){
                System.out.print("enter the index where you want to add element:-");
                int ele=sc.nextInt();
                if(list.contains(ele)){
                    int index=list.indexOf(ele);
                    System.out.print("enter the element who want to addd:");
                    int newele=sc.nextInt();
                    list.set(index,newele);
                    System.out.println("element Replace");

                }else {
                    System.out.println("No such element location");
                }
            }
            else if(ch==4){
                if(list.isEmpty()){
                    System.out.println("no any element");
                }else {
                    System.out.println("List is: "+list);
                }

            }
            else if(ch==5){
                Collections.sort(list);
                System.out.println("List sorted");
            } else if (ch==6) {
                Collections.reverse(list);
                System.out.println("Reverse the list");
            } else if (ch==7) {
                System.out.println("enter the element to remove");
                int ele=sc.nextInt();
                if(list.contains(ele)){
                    int index=list.indexOf(ele);
                    list.remove(index);
                    System.out.println("remove list");
                }else {
                    System.out.println("no such element available");
                }
            } else if (ch==8) {
                System.out.println("End");
                System.exit(1);
            }
            else
            {
                System.out.println("invalid choice");
            }

        }
    }
}
