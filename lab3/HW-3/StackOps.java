package lab3;

import lab3.Stack;

public class StackOps {
    public static void transfer(Stack s, Stack t) {
        while (!s.isEmpty())
            t.push(s.pop());
    }

    public static void empty(Stack stack) {
        if(!stack.isEmpty()) {
            stack.pop();
            empty(stack);
        }
    }
}
