package Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookAdd {
    public static void main(String[] args) {
        Map<String,Double> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Display Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Quit");

            System.out.print("Enter choice: ");
            int ch=sc.nextInt();
            if(ch==1){
                System.out.print("Enter the Book name");
                String name=sc.next();

                if(map.containsKey(name)){
                    System.out.println("Book is already available");
                }
                else {
                    System.out.print("Enter Price: ");
                    double price=sc.nextDouble();

                    map.put(name,price);
                    System.out.println("Added successfully");
                }
            } else if (ch==2) {
                System.out.print("enter book name:");
                String name=sc.next();
                if(map.containsKey(name)){
                    System.out.print("enter price: ");
                    double price=sc.nextDouble();
                    map.replace(name,price);
                    System.out.println("Update successfully");
                }else {
                    System.out.println("ERROR: invalid book details");
                }

            } else if (ch==3) {
                System.out.print("Enter the book Name:");
                String name=sc.next();
                if(map.containsKey(name)){
                    System.out.println("Name: "+name);
                    System.out.println("Price: "+map.get(name));
                }
                else {
                    System.out.println("Not book available");
                }


            }
            else if(ch==4){
                System.out.print("Enter book Name:");
                String name=sc.next();
                if(map.containsKey(name)){
                    map.remove(name);
                    System.out.println("remove successfully");
                }
                else {
                    System.out.println("invalid book");
                }
            }
            else if (ch==5){
                System.out.println("End:");
                System.exit(1);
            }
        }
    }
}
