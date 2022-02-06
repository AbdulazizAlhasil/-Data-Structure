
package datastructure_lab2;

public class Lap2 {

    
    
    //a Java method that Reverse an array using another array.
        public static  void rev(int[] x)
        {
            int j=0;
            int[] z=new int[x.length];
            for (int i=x.length-1;i>=0;i--)
            {
                z[j]=x[i];
                System.out.println(z[j]);
                j++;
            }
        }
        
   //a Java method that Clone an array to a backup array.
    public static void backup(int[] x)
        {
            int[] y= new int[x.length];
            
            for(int i=0;i<x.length;i++){
                y[i]=x[i];
                System.out.println(y[i]);
            }
        }
    
    //a Java method that remove elements from an array.
    public static void remove(int[] x,int index){
        for(int i=0;i<x.length;i++)
        {
            if(index<x.length)
            {
                x[index]=0;
               
            }
              
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] x={1,2,3};
     rev(x);
       backup(x);
        remove(x,1);
                      
    }
    
}
