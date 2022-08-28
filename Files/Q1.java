import java.util.*;
import java.io.*;

public class Q1 {
    public static void main(String[] args){
        ArrayList<String> output=new ArrayList<>();
        BufferedReader reader=null;
        try{
            reader=new BufferedReader(new FileReader("F:\\input1.txt"));
            String currentLine= reader.readLine();
            while(currentLine!=null){
                if(!isLineEmpty(currentLine) && isLineToBeConsidered(currentLine))
                    output.add(currentLine);
                currentLine=reader.readLine();
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(output);
    }
    private static boolean isLineEmpty(String currentLine){
        return "".equals(currentLine);
    }
    private static boolean isLineToBeConsidered(String Line){
        char x=Line.charAt(0);
        return x!='#';
    }
}
