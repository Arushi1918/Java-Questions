import java.util.*;
public class MaxOccuringChar {
    public static void main(String[] args){
        System.out.println("Enter the string: ");
        Scanner s=new Scanner(System.in);
        String str=s.next();
        System.out.println(getChar(str));
    }

    private static char getChar(String str){
        int count, maxCount=0;
        char max0cChar=0;
        HashMap<Character,Integer> cihm=new HashMap<>();
        for(int i=0; i<str.length(); i++){
            if(cihm.get(str.charAt(i))==null){
                count=1;
                cihm.put(str.charAt(i),count);
            }
            else{
                count=cihm.get(str.charAt(i));
                cihm.put(str.charAt(i),++count);
            }
            if(count>maxCount){
                max0cChar=str.charAt(i);
                maxCount=count;
            }
        }
        System.out.println(cihm);
        return max0cChar;
    }
}
