import java.util.*;
public class NextHighest {
    public static void main(String[] args){
        System.out.println("Enter array size: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Enter array elements: ");
        int a[] =new int[n];
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        System.out.println("Enter element: ");
        int x=s.nextInt();
        System.out.println("Next Highest Element is: "+ getNextHighest(a,x));
    }

    private static int getNextHighest(int[] a, int x){
        TreeMap<Integer,Boolean> tm=new TreeMap<>();
        for(int ele:a)
            tm.put(ele,true);
        return tm.higherKey(x);
    }
}
