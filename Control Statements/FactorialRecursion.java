import java.util.*;
public class FactorialRecursion {
    static int fact(int n){
        int output;
        if(n==1){
            return 1;
        }
        output=fact(n-1)*n;
        return output;
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(("Factorial of "+num+" is: "+ fact(num)));
    }
}
