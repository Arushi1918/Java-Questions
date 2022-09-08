import java.util.*;
public class Pattern4 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of levels: ");
        int n=s.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=64+n; j>64+n-i; j--){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
