```ruby

package com.hello_world;
import java.util.Scanner;
public class array_of_ten_elements {
    public static void main (String[] args) {
     
         int[] array = new int[10];

        Scanner input = new Scanner(System.in);
        System.out.println("Pleas Enter 10 numbers");
        for (int i = 0; i< array.length; i++)
            array[i] = input.nextInt();

        System.out.println("The Number is");
        
        for (i=0;i<array.length;i++)
             
        System.out.println(array[i]);
    
  
    }
}


   


```
