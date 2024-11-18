package Collection.ArrayOperation;

import Collection.POJOTest.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrudOperation2 {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<Employee>();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1. Add Record");
            System.out.println("2. Display");
            System.out.println("3. Display All");
            System.out.println("4. Update Details");
            System.out.println("5. Delete Record");
            System.out.println("6 Quit");

            System.out.print("enter your choice:");
            int ch=sc.nextInt();
            if(ch==1){
                System.out.println("*********Add your Details********");
                System.out.print("Id:-");
                int id=sc.nextInt();
                System.out.print("Name:-");
                String name=sc.next();
                System.out.print("Salary:-");
                double salary=sc.nextDouble();
                Employee e=new Employee();
                e.setId(id);
                e.setName(name);
                e.setSalary(salary);
                list.add(e);
                System.out.println("Detail Added successfully");
            } else if (ch==2) {
                if(list.isEmpty()){
                    System.out.println("no any detail found");
                }else {
                    System.out.println("Enter Id:-");
                    int id=sc.nextInt();

                    boolean found=false;
                    for(Employee e:list){
                        if(e.getId()==id){
                            System.out.println("Name:-"+e.getName());
                            System.out.println("Salary:-"+e.getSalary());
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("invalid Id");
                    }
                }

            }
            else if (ch==3) {
                if(list.isEmpty()){
                    System.out.println("No Detail");
                }else {
                    System.out.println("Details:- ");
                   for(Employee e:list) {
                       System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
                   }
                }

            }
            else if(ch==4){
                if(list.isEmpty()){
                    System.out.println("no Detail Available");
                }else {
                    System.out.println("Enter Id:-");
                    int id=sc.nextInt();

                    boolean found=false;
                    for (Employee e:list){
                        if(e.getId()==id){
                            System.out.println("Enter sal to update: ");
                            double salary=sc.nextDouble();
                            e.setSalary(salary);
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("invalid ID");
                    }
                }
            }
            else if(ch==5){
                if(list.isEmpty()){
                    System.out.println("no detail available");
                }
                else {
                    System.out.println("Enter id:-");
                    int id=sc.nextInt();

                    boolean found=false;
                    for (Employee e:list){
                        if(e.getId()==id){
                            int index=list.indexOf(e);
                            list.remove(index);
                            System.out.println("Removed");
                            found=true;
                            break;

                        }
                    }
                    if(!found){
                        System.out.println("invalid Id");
                    }
                }
            } else if (ch==6) {
                System.out.println("End");
                System.exit(1);


            }
            else {
                System.out.println("invalid choice");
            }
        }
    }
}
