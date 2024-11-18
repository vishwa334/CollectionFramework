package Collection.ArrayObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<Employee>();
        System.out.println("enter 5 detail ");
        for (int i = 1; i <=5; i++) {
            System.out.println("enter emp: " + i + "details: ");
            int ids = i;
            System.out.print("Name:-");
            String name = sc.next();
            System.out.print("Salary:-"); Double salary = sc.nextDouble();
            Employee e = new Employee(ids, name, salary);
            list.add(e);
        }
        for (Employee e : list) {
            System.out.println(e.ids + " " + e.name + " " + e.salary);
        }
    }
}
