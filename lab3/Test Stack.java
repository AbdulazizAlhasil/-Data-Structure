import java.util.Scanner;

public class test_stack {
    public static void main(String[] args) {
        arraystack<Integer> mystack=new arraystack<>(5);
        Scanner in = new Scanner(System.in);
        System.out.println("is the stack empty ?"+mystack.isempty());
        System.out.println("input elements");
        for (int i = 0; i < 6; i++) {
            mystack.push(in.nextInt());
            System.out.println("top element ="+mystack.top());
            System.out.println("size ="+mystack.size());
            System.out.println("is the stack empty ?"+mystack.isempty());
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("deleted element ="+mystack.pop());
            System.out.println("top element after delete = "+mystack.top());
            System.out.println("size ="+mystack.size());
            System.out.println("is the stack empty ?"+mystack.isempty());
        }
    }
}




