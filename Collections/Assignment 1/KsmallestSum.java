import java.util.*;
public class KsmallestSum {
    public static void main(String[] args){
        System.out.println("Enter array size: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Enter array elements: ");
        int a[] =new int[n];
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k=s.nextInt();
        System.out.println("sum of K smallest elements is: "+ getSum(a,k));
    }

    private static int getSum(int[] a, int k){
        TreeSet<Integer> set=new TreeSet<>();
        int sum=0;
        if(k>a.length)
            return -1;
        for(int ele:a)
            set.add(ele);
        while(k>0){
            sum+=set.pollFirst();
            k--;
        }
        return sum;
    }
}
