

import java.io.*;
import java.util.*;
import java.lang.*;
public class ContestQuestion {
    public static void main(String args[] ) throws Exception {

        //Write code
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        int i=0;
        int ans[]=new int[n];
        while(i<n){
            String input=s.nextLine();
            ans[i]=ComputeXOR(input);
            i++;
        }
        for(i=0; i<n; i++){
            System.out.println(ans[i]);
        }

    }

    public static int ComputeXOR(String input){
        String[] arr=input.split(" ");
        int N=0,M=0;
        try{
            N=Integer.parseInt(arr[0]);
            M=Integer.parseInt(arr[1]);
        }catch(Exception e){
            System.out.println("Invalid");
        }

        int Max=0;
        int temp=0;
        for(int i=N; i<M; i++){
            for(int j=N; j<M; j++){
                temp=(i|j)&(~i|~j);
                if(temp>Max){
                    Max=temp;
                }
            }
        }
        return Max;

    }
}
