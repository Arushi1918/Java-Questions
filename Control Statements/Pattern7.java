import java.util.*;
public class Pattern7 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter no. of levels: ");
        int n=s.nextInt();
        int k=n, z=n;
        for(int i=1; i<=2*n-1; i++){
            if(i>0){
                for(int j=n; j>k; j--)
                    System.out.print(j);
            }
            for(int y=2*k-1; y>0; y--)
                System.out.print(k);
            if(i>0){
                for(int j=k+1; j<=n; j++)
                    System.out.print(j);
            }
            System.out.println();
            z--;
            if(z>0){
                k--;
            }
            else{
                k++;
            }
        }
    }
}
