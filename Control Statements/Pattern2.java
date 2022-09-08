import java.util.*;
public class Pattern2 {
    public static void main(String[] args){
        System.out.println("Enter no. of levels");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int k=1; k<=n; k++){
            for(int i=1; i<=2*n; i++){
                if(i<=k)
                    System.out.print(i);
                else if(i>k && i<2*n-k+1)
                    System.out.print(' ');
                else
                {
                    int temp=2*n-i+1;
                    System.out.print(temp);
                }

            }
            System.out.println();
        }
    }
}
