import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String [] args)
    {
        int n, sum=0, temp, remainder, digits;
        Scanner s= new Scanner(System.in);
        n=s.nextInt();

        digits=1+(int)Math.floor(Math.log10(n));
        temp=n;

        while(temp!=0)
        {
            remainder=temp%10;
            sum+=Math.pow(remainder, digits);
            temp=temp/10;
        }

        if(n==sum)
            System.out.println(n + " is an armstrong no.");
        else
            System.out.println(n + " is not an armstrong no.");
    }
}
