package Collection.Stack;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        System.out.println("Stack is: "+stk);

        System.out.println("Pop : "+stk.pop());
        System.out.println("after poping Stack:-"+stk);
        System.out.println("Pop : "+stk.pop());
        System.out.println("After poping stack:"+stk);

        stk.push(50);
        stk.push(60);
        System.out.println("Stack is: "+stk);

        System.out.println("Peek :"+stk.peek());
        System.out.println("peek :"+stk.peek());
        System.out.println("stack: "+stk);
    }
}
