import java.util.*;
public class FindMissingNumber {
   public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter array elements separated by space:(Sorted) ");
       String arr=s.nextLine();
       String[] array = arr.split(" ");

       System.out.println("Number missing between 1-100: ");
       try{
           for(int i=1,j=0; i<=100; i++){
               int curr=Integer.parseInt(array[j]);
               if(j<array.length && i==curr)
                   j++;
               else
                   System.out.println(i+" ");
           }
       }
       catch(Exception e){
           System.out.println("Invalid operation");
       }
   }
}
