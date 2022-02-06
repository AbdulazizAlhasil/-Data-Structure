package Lab3;

import lab3.ArrayStack;
import lab3.Stack;

public class AddStack {
    public static void main (String[] args) {
        Stack<String> s1 = new ArrayStack<String>(6);
        Stack<String> s2 = new ArrayStack<String>(6);

        s1.push("Khaled");
        s1.push("salem");
        s1.push("ahmad");
        s1.push("emad");

        StackOpration.transfer(s1, s2);

        System.out.println(s2.top());
        s2.pop();
        System.out.println(s2.top());
        s2.pop();
        System.out.println(s2.top());
        s2.pop();
        System.out.println(s2.top());
        s2.pop();

        s1.push("Khaled");
        s1.push("salem");
        s1.push("ahmad");
        s1.push("emad");

        System.out.println(s1.size());
        StackOpration.empty(s1);
        System.out.println(s1.size());
    }
}
