import java.util.*;
public class kthLargest2 {

    public static void main(String[] args){
        System.out.println("Enter array size: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Enter array elements: ");
        int a[] =new int[n];
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        System.out.println("Enter largest element no. you want to find: ");
        int k=s.nextInt();
        System.out.println(getElement(a,k,n));
    }

    private static int getElement(int[] a, int k, int n){
        PriorityQueue<Integer> integerPriorityQueue=new PriorityQueue<Integer>(10);
        if(a.length<k){
            return -1;
        }
        int kthelement=0;
        for(int e:a)
        {
            integerPriorityQueue.add(e);
        }
        for(int i=0; i<n-k+1; i++){
            kthelement=integerPriorityQueue.poll();

        }
        return kthelement;
    }
}
