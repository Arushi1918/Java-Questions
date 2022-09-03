import java.util.*;
public class MaxEle {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        System.out.println(("Enter a sequence of numbers ending with 0: "));
        Integer no=s.nextInt();
        while(no.intValue()!=0){
            list.add(no);
            no=s.nextInt();
        }
        System.out.println("The largest no. in the input is "+max(list));
    }

    public static Integer max(ArrayList<Integer> list){
        if(list.size()==0)
            return null;
        Integer max= list.get(0);
        for(int i=0;i<list.size(); i++){
            if(list.get(i)>max)
                max=list.get(i);
        }
        return max;
    }
}
