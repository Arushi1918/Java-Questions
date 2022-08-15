import java.util.*;
public class Duplicate {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n=s.nextInt();
        int[] numbers=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n; i++){
            numbers[i]=s.nextInt();
        }
        Arrays.sort(numbers);
         for(int i=1; i<n; i++){
             if(numbers[i]==numbers[i-1])
                 System.out.println("Duplicate: "+numbers[i]);
         }
    }
}
