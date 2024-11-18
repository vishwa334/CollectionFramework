package Collection.Vector;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<Integer>();
        for (int i=1;i<=5;i++){
            v.add(i*5);
        }
        System.out.println(v);
    }
}
