import java.util.*;
public class SearchElement {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n=s.nextInt();
        int[] numbers=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n; i++){
            numbers[i]=s.nextInt();
        }
        System.out.println("Enter target number: ");
        int target=s.nextInt();
        for(int i=0; i<n; i++){
            if(numbers[i]==target){
                System.out.println(("Elememt found at index: "+i));
                break;
            }
        }
    }
}
