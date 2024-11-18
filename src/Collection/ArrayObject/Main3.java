package Collection.ArrayObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<Employee>();
        while (true)
        {
            System.out.println("enter emp details: ");
            System.out.print("Sr. No.:-");
            int ids = sc.nextInt();
            System.out.print("Name:-");
            String name = sc.next();
            System.out.print("Salary:-"); Double salary = sc.nextDouble();
            Employee e = new Employee(ids, name, salary);
            list.add(e);

            System.out.println("enter the choice you add detail yes or no:- ");
            String choice=sc.next();
            if(choice.equals("no")){
                break;
            }
        }
        for (Employee e:list){
            System.out.println(e.ids+" "+e.name+" "+e.salary);
        }
    }
}
