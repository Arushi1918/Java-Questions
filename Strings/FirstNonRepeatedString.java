import java.util.*;
public class FirstNonRepeatedString {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String: ");
        String input=s.nextLine();
        char process[]=input.toCharArray();
        boolean status=false;
        int index=0;
        for(int i=0; i<process.length; i++){
            for(int j=i+1; j<process.length; j++){
                if(process[i]==process[j]){
                    status=false;break;
                }else{
                    status=true;
                    index=i;
                }
            }
            if(status){
                System.out.println("First non-repeated string is "+process[i]+" at index "+index);
            }
        }
    }
}
