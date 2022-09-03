import java.util.*;
public class checkPairSum {
    public static void main(String[] args){
        System.out.println("Enter array size: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Enter array elements: ");
        int a[] =new int[n];
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        System.out.println("Enter sum: ");
        int x=s.nextInt();
        int[] output=getPair(a,x);
        System.out.println(output[0]+" "+output[1]);
    }

    private static int[] getPair(int[] a, int x){
        HashMap<Integer, Boolean> hm=new HashMap<>();
        int[] output=new int[]{-1,-1};
        for(int ele:a)
            hm.put(ele,true);
        for(int ele:a){
            if(hm.get(x-ele)!=null){
                output[0]=ele;
                output[1]=x-ele;
                return output;
            }
        }
        return output;
    }
}
