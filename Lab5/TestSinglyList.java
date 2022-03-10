import java.util.Scanner;

/**
 * Created by Arabic on 21/02/22.
 */
public class TestSinglyList {
    public static void main(String[] args) {
        SinglyLinkedList<String>list= new SinglyLinkedList<>();
        Scanner in= new Scanner(System.in);
        int choice=-1;
        System.out.println("1 add first\t2 add last \t3 remove first");
        while (choice!=0)
        {
            System.out.print("your choice:");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("input name: ");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.print("input name: ");
                    list.addLast(in.next());
                    break;
                case 3:
                    System.out.println("deleted is "+list.removeFirst());
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.println("first= "+list.first()+"\t" +
                    "last= "+list.last()+"\t" +
                    "size= "+list.size());
        }
    }
}
