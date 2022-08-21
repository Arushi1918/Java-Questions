import java.util.*;
public class Answer {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        boolean cI=true;

        System.out.println("Enter 2 numbers");
        do{
            try{
                int n1=s.nextInt();
                int n2= s.nextInt();
                System.out.println("sum= "+(n1+n2));
                cI=false;
            }
            catch (InputMismatchException e){
                System.out.println("try again");
                s.nextLine();
            }
        }while (cI);
    }
}
