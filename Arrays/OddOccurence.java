import java.util.*;
public class OddOccurence {
    public static void main(String[] args){
        OddOccurence occur=new OddOccurence();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n=s.nextInt();
        int[] numbers=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n; i++){
            numbers[i]=s.nextInt();
        }
        System.out.println(occur.getOddOccurence(numbers));
    }

    int getOddOccurence(int[] array){
        int res=0;
        for(int i=0; i<array.length; i++){
            res=res^array[i];
            System.out.println(res);
        }
        return res;
    }
}
