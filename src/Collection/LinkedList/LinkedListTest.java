package Collection.LinkedList;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("apple");
        list.add("orange");
        list.add("mango");
        list.add("grapes");
        list.add("banana");
        System.out.println("LinkedList: "+list);

        String first=list.getFirst();
        String last= list.getLast();
        System.out.println("First: "+first);
        System.out.println("Last: "+last);

        String element=list.get(2);
        System.out.println("Element at position 2: "+element);

        boolean contain=list.contains("banana");
        System.out.println("contains Banana: "+contain);

        list.removeFirst();
        list.removeLast();
        System.out.println("list: "+list);

        list.remove(1);
        System.out.println(list);
        System.out.println("Size :"+list.size());
    }
}
