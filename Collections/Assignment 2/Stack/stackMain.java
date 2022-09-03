import java.util.*;
public class stackMain {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        MyStack stack=new MyStack();
        System.out.println("Enter list size: ");
        int n=s.nextInt();
        System.out.println("Enter list elements: ");
        for(int i=0; i<n; i++){
            stack.push(s.next());}
        System.out.println("Stack: "+stack.toString());
    }
}
