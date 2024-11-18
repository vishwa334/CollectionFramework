package Collection.Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackMenuDriven {
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. peek");
            System.out.println("5. Quit");

            System.out.print("enter choice: ");
            int ch=sc.nextInt();
            if(ch==1){
                System.out.println("Enter element who want to push: ");
                int ele=sc.nextInt();
                stk.push(ele);
                System.out.println("stack Push");
            } else if (ch==2) {
                if(stk.isEmpty()){
                    System.out.println("stack is empty");
                }
                else {

                    System.out.println("Pop: "+stk.pop());
                }

            } else if (ch==3) {
                if(stk.isEmpty()){
                    System.out.println("stack is empty");
                }else {
                    System.out.println("Stack is: "+stk);
                }

            } else if (ch==4) {
                System.out.println("Peek :"+stk.peek());

            }
            else if (ch==5){
                System.out.println("End");
                System.exit(1);
            }
            else {
                System.out.println("invalid choice");
            }
        }
    }
}
