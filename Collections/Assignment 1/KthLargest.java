import java.util.*;
public class KthLargest {

    public static class reverseIntComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer x, Integer y) {
            if(x<y){
                return 1;
            }
            if(x>y){
                return -1;
            }
            return 0;
        }
    }
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
        System.out.println(getElement(a,k));
    }

    private static int getElement(int[] a, int k){
        Comparator<Integer> comparator=new reverseIntComparator();
        PriorityQueue<Integer> integerPriorityQueue=new PriorityQueue<Integer>(10,comparator);
        if(a.length<k){
            return -1;
        }
        int kthelement=0;
        for(int e:a)
        {
            integerPriorityQueue.add(e);
        }
        for(int i=0; i<k; i++){
            kthelement=integerPriorityQueue.poll();

        }
        return kthelement;
    }
}
