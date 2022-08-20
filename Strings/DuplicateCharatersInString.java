import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class DuplicateCharatersInString {
    public static void main(String [] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        String repeatedchar=" ";
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(input.indexOf(c,i+1)>0 && repeatedchar.indexOf(c)==-1){
                repeatedchar=repeatedchar+c;
            }
        }
        System.out.print(repeatedchar);
    }
}
