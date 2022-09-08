import java.util.*;
public class Pattern3 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of levels: ");
        int n=s.nextInt();
        char i='A';
        while(n>0){
            for(int j=n-1; j>0; j--)
                System.out.print(' ');
            for(char j='A'; j<=i; j++)
                System.out.print(j);
            if(i!='A'){
                char j=i;
                for(--j; j>='A'; j--)
                    System.out.print(j);
            }
            System.out.println();
            n--;
            i++;
        }
    }
}
