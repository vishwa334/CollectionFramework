package Collection.ArrayObject;

import java.util.ArrayList;
import java.util.List;


public class Main{

    public static void main(String[] args) {
        List<Employee> list=new ArrayList<Employee>();
        int[] ids={1,2,3};
        String[] name={"ram","shyam","mohan"};
        Double[] salary={2000.0,3000.0,3000.0};
        for (int i=0;i<=ids.length-1;i++){
            Employee e=new Employee(ids[i],name[i],salary[i]);
            list.add(e);

        }
        for (Employee e:list){
            System.out.println(e.ids+" "+e.name+" "+e.salary);
        }
    }
}
