import java.util.*;
public class Pattern1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of levels");
        int n=s.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                for(int j=1; j<=i; j++)
                    System.out.print(j%2);
                System.out.println();
            }
            else if(i%2==0){
                for(int j=0; j<i; j++)
                    System.out.print(j%2);
                System.out.println();
            }
        }
    }
}
