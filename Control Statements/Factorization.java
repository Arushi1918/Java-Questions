/*(Find the factors of an integer) Write a program that reads an integer and displays
all its smallest factors in increasing order. For example, if the input integer is
120, the output should be as follows: 2, 2, 2, 3, 5.*/

import java.util.*;

public class Factorization {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int no=s.nextInt();
        int index=2;

        while(no/index!=1){
            if(no%index==0){
                System.out.print(index+", ");
                no/=index;
            }
            else
                index++;
        }
        System.out.println(no+".");
    }
}
