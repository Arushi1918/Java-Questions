import java.util.*;

public class Diamond {
    public static void printchars(int n,char c)
    {
        for(int i=0; i<n; i++){
            System.out.print(c);
        }
    }

    public static void main(String[] args){
        int n,c,k,space;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        n=s.nextInt();
        space=n-1;
        for(k=1; k<=n; k++){
            printchars(space,' ');
            space--;
            printchars(2*k-1,'*');
            System.out.println("");
        }
        space=1;
        for(k=1;k<=n-1;k++)
        {
            printchars(space,' ');
            space++;
            printchars(2*(n-k)-1,'*');
            System.out.println("");
        }
    }
}
