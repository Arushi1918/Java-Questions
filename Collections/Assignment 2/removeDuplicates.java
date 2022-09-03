import java.util.*;
public class removeDuplicates {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter list size: ");
        int n=s.nextInt();
        System.out.println("Enter list elements: ");
        for(int i=0; i<n; i++){
            list.add(s.nextInt());}
        removeDuplicate(list);
        System.out.println(list);
    }
    private static void removeDuplicate(ArrayList<Integer> list){
        for(int i=0; i<list.size()-1; i++){
            for(int j=i+1; j< list.size(); j++){
                if(list.get(i)==list.get(j))
                    list.remove(j);
            }
        }
    }
}
