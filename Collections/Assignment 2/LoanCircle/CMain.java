import java.util.*;
public class CMain {
    public static void main(String[] args){
        ArrayList<Object> o=new ArrayList<>();
        o.add(new Loan());
        o.add(new Date());
        o.add(new String("String class"));
        o.add(new Circle());

        for(int i=0; i<o.size(); i++){
            System.out.println(o.get(i).toString());
        }
    }
}
