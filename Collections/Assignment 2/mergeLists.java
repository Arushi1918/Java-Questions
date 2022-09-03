import java.util.*;
public class mergeLists {
    public static void main(String[] args){
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        Scanner s=new Scanner(System.in);

        System.out.println("Enter list 1 size: ");
        int n1=s.nextInt();
        System.out.println("Enter list 1 elements: ");
        for(int i=0; i<n1; i++){
            list1.add(s.nextInt());}
        System.out.println("Enter list 2 size: ");
        int n2=s.nextInt();
        System.out.println("Enter list 2 elements: ");
        for(int i=0; i<n2; i++){
            list2.add(s.nextInt());}

        ArrayList<Integer> list3=union(list1, list2);
        System.out.println("Combined List: "+ list3);
    }

    private static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list3=list1;
        for(int i=0; i<list2.size(); i++){
            list3.add(list2.get(i));
        }
        return list3;
    }
}
