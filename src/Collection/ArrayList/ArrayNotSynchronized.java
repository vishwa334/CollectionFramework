package Collection.ArrayList;

import java.util.ArrayList;

class Test{
    static ArrayList<Integer> list=new ArrayList<Integer>();

}
class First extends Thread{

    @Override
    public void run(){
        for (int i=1;i<100000;i++){
            Test.list.add(i);
        }
    }
}
class Second extends Thread{
    @Override
    public void run() {
        for(int i=1;i<10000;i++){
            Test.list.add(i);
        }
    }
}
public class ArrayNotSynchronized  {
    public static void main(String[] args) throws Exception{
        First f=new First();
        Second s=new Second();
        f.start();
        s.start();
        f.join();
        s.join();
        System.out.println("List size is: "+Test.list.size());


    }
}
