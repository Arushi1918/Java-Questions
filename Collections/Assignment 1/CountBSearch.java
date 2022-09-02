import java.util.*;
public class CountBSearch {
    public static void main(String[] args){
        System.out.println("Enter array size: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Enter array elements: ");
        int a[] =new int[n];
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        System.out.println(countones(a));
    }
    private static int countones(int[] a){
        int mid=0, low=0, high=a.length;
        while (low != high) {
            mid=(low+high)/2;
            if(a[mid]==0){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return a[low]==0?a.length-(low+1):a.length-low;
    }
}
