import java.util.*;
public class sortArrayList {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter list size: ");
        int n=s.nextInt();
        System.out.println("Enter list elements: ");
        for(int i=0; i<n; i++){
            list.add(s.nextInt());}

        Collections.sort(list);
        System.out.println(list.toString());
    }

}
