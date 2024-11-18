package Collection.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<Integer>();
        for(int i=1;i<=5;i++){
            v.add(i*5);
        }
        Enumeration<Integer> e=v.elements();
        while (e.hasMoreElements()){
            Integer x=e.nextElement();
            System.out.println(x);
        }
    }
}
