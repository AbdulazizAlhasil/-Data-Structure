import java.util.Arrays;

public class reverseStack {
    public static void main(String[] args) {
        int []a={10,20,30,40,50};
        arraystack<Integer> s =new arraystack<>(a.length);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i <a.length ; i++) {
            s.push(a[i]);
        }
        for (int i = 0; i <a.length ; i++) {
            a[i]=s.pop();
        }
        System.out.println("after reverse using stack");
        System.out.println(Arrays.toString(a));
    }
}
