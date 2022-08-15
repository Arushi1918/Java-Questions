import java.util.*;
public class MaxMin {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array elements separated by space: ");
        String arr=s.nextLine();
        String[] array = arr.split(" ");
        try{
            int largest=Integer.parseInt(array[0]);
            int smallest=Integer.parseInt(array[0]);

            for(int i=1; i<array.length; i++){
                largest=maximum(largest, Integer.parseInt(array[i]));
                smallest=minimum(smallest, Integer.parseInt(array[i]));
            }
            System.out.println("Largest element: "+largest +"\nSmallest Element: "+smallest);
        }
        catch(Exception e){
            System.out.println("Invalid operation");
        }
    }

    public static int maximum(int l, int curr){
        return curr>l?curr:l;
    }
    public static int minimum(int s, int curr){
        return curr>s?s:curr;
    }
}
