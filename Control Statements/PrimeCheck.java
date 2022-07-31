import java.util.*;

public class PrimeCheck {
    public static void main(String [] args)
    {
        boolean isPrime=true;
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for(int i=2; i<Math.ceil(Math.sqrt(num)); i++)
        {
            if(num%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.println(num + "is prime number");
        else
            System.out.println(num + "is not prime number");
    }
}
