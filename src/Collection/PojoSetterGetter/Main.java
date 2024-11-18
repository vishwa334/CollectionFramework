package Collection.PojoSetterGetter;

import Collection.POJOTest.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employe> list=new ArrayList<Employe>();
        int[] id={101,102,103,104,105,106};
        String[] name={"Amar","Hareen","Satya","Annie","Raji","Harsha"};
        double[] salary={20000,30000,50000,60000,40000,3000};
        String[] dept={"dev","net","web","dev","net","web"};
        String[] location={"hyderabad","mumbai","chennie","gurugao","london","delhi"};
        for(int i=0;i<id.length-1;i++){

            Employe e=new Employe();
            e.setId(id[i]);
            e.setName(name[i]);
            e.setSalary(salary[i]);
            e.setDept(dept[i]);
            e.setLocation(location[i]);
            list.add(e);


        }
        System.out.println("Employe details are:");
        for (Employe e:list){
            System.out.println(e.getId()+" , "+e.getName()+" , "+e.getSalary()+" , "+e.getDept()+" , "+e.getLocation());
        }

    }
}
