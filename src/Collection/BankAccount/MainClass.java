package Collection.BankAccount;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Map<Integer,BankAccount> map=new HashMap<Integer,BankAccount>();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1. Add Account");
            System.out.println("2. Update Location");
            System.out.println("3. Display Account");
            System.out.println("4. Remove Account");
//            System.out.println("5. Display All Account");
            System.out.println("5. Quit");

            System.out.print("Enter the choice:-");
            int ch=sc.nextInt();

            if(ch==1){
                System.out.println("Enter Account Number");
                int number=sc.nextInt();
                if(map.containsKey(number)){
                    System.out.println("Account is already Exits");
                }
                else {
                    System.out.println("Enter Details");
                    System.out.print("Name:-");
                    String name=sc.next();
                    System.out.print("Location:-");
                    String location=sc.next();
                    System.out.print("Balance:-");
                    double balance=sc.nextDouble();

                    BankAccount b=new BankAccount();
                    b.setName(name);
                    b.setLocation(location);
                    b.setBalance(balance);
                    map.put(number,b);
                    System.out.println("record added succefully");
                }
            } else if (ch==2) {
                System.out.print("Enter the Account Number:-");
                int number=sc.nextInt();
                if (map.containsKey(number)){
                    System.out.print("enter the location:");
                    String location=sc.next();
                    BankAccount acc=map.get(number);
                    acc.setLocation(location);
                    System.out.println("Location updated");

                }
                else {
                    System.out.println("invalid account");
                }
            }
            else if (ch==3){
                System.out.print("Enter Account Number");
                int number=sc.nextInt();
                if(map.containsKey(number)){
                    BankAccount b=map.get(number);
                    System.out.println("Details are: "+number+" "+b.getName()+" "+b.getLocation()+" "+b.getBalance());
                }
                else {
                    System.out.println("invalid account number");
                }
            } else if (ch==4) {
                System.out.print("Enter the Account Number:-");
                int number=sc.nextInt();
                if(map.containsKey(number)){
                    BankAccount b=map.get(number);
                    map.remove(b);
                    System.out.println("remove data");
                }
                else {
                    System.out.println("invalid account number");
                }


            } else if (ch==5){
                System.out.println("End");
                System.exit(1);
            }
            else {
                System.out.println("invalid choice");
            }
        }
    }
}
