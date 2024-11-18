package Collection.POJOTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<Employee>();
        Scanner sc=new Scanner(System.in);
       while (true)
       {
           System.out.println("*********enter the detail**********");
           System.out.print("ID:-");
           int id=sc.nextInt();
           System.out.print("Name:-");
           String name=sc.next();
           System.out.print("salary:-");
           Double salary=sc.nextDouble();

           Employee e=new Employee();
           e.setId(id);
           e.setName(name);
           e.setSalary(salary);
           list.add(e);

           System.out.println("you want to add more detail yes/no");
           if(sc.next().charAt(0)=='n'){
               break;
           }
       }
       for(Employee e:list){
           System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
       }
    }
}
