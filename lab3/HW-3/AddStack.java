package Lab3;

import lab3.ArrayStack;
import lab3.Stack;

public class AddStack {
    public static void main (String[] args) {
        Stack<String> stack1 = new ArrayStack<String>(6);
        Stack<String> stack2 = new ArrayStack<String>(6);

        stack1.push("Khaled");
        stack1.push("salem");
        stack1.push("ahmad");
        stack1.push("emad");

        StackOpration.transfer(stack1, stack2);

        System.out.println(stack2.top());
        stack2.pop();
        System.out.println(stack2.top());
        stack2.pop();
        System.out.println(stack2.top());
        stack2.pop();
        System.out.println(stack2.top());
        stack2.pop();

        stack1.push("Khaled");
        stack1.push("salem");
        stack1.push("ahmad");
        stack1.push("emad");

        System.out.println(stack1.size());
        StackOpration.empty(stack1);
        System.out.println(stack1.size());
    }
}
