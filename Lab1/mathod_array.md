```ruby



package mathod_array;
import java.util.Scanner;

public class Mathod_Array {

    
    public static void Print(int arr[] ) {
         for(int i=0;i<arr.length;i++)
        
        System.out.print(arr[i]+"\t");
        
    }
      public static void insert(int arr[] ) {
          
        Scanner in =new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
            arr[i]=in.nextInt();
        
    }
    public static void main(String[] args) {
      int [] b=new int [5];
        insert(b);
        Print(b);
        
    }
    
}




```
