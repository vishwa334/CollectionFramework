package Collection.ArrayList;

import java.util.*;

class Employee{
    int id;
    String Name;
    Double salary;
    Employee(int id,String Name,Double salary){
        this.id=id;
        this.Name=Name;
        this.salary=salary;
    }
}

public class ListOfObject {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<Employee>();
//
//        System.out.println("******using for-each loop*****");
//        Employee e1=new Employee(1,"ram",20000.0);
//        Employee e2=new Employee(2,"sohan",30000.0);
//        Employee e3=new Employee(3,"mohan",40000.0);
//        list.add(e1);
//        list.add(e2);
//        list.add(e3);
//        System.out.println("Details are: ");
//        for(Employee x:list){
//            System.out.println(x.id+" "+x.Name+" "+x.salary);
//        }


        list.add(new Employee(1,"ram",20000.0));
        list.add(new Employee(2,"sohan",30000.0));
        list.add(new Employee(3,"mohan",40000.0));

        System.out.println("*************using direct add object*******");
        System.out.println("Details are: ");
        for(Employee x:list){
            System.out.println(x.id+" "+x.Name+" "+x.salary);
        }

        System.out.println("************ USING FOR LOOP for display");
        for (int i=0;i<=list.size()-1;i++){
            Employee e=list.get(i);
            System.out.println(e.id+" "+e.Name+" "+e.salary);
        }

        System.out.println("******reverse the list");
        for(int i=list.size()-1;i>=0;i--){
            Employee e=list.get(i);
            System.out.println(e.id+" "+e.Name+" "+e.salary);
        }


        System.out.println("****for using iterator method******");

            Iterator<Employee> itr=list.iterator();
        while (itr.hasNext()){
                Employee e = itr.next();
                System.out.println(e.id+" "+e.Name+" "+e.salary);
            }
        System.out.println("*****using list iterator reverse*******");
        ListIterator<Employee> itr1=list.listIterator(list.size());
            while (itr1.hasPrevious()){
                Employee e=itr1.previous();
                System.out.println(e.id+" "+e.Name+" "+e.salary);

            }
    }
}
