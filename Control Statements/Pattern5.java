import java.util.*;
public class Pattern5 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of levels: ");
        int n=s.nextInt();
        int j=n, k=n+1, z=n;
        for(int i=1; i<=2*n; i++){
            for(int l=1; l<=2*n; l++){
                if(l<=j || l>=k)
                    System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.println();
            z--;
            if(z>0){
                --j; ++k;
            }
            else if(z==0){
                continue;
            }
            else{
                ++j;--k;
            }

        }
    }
}
