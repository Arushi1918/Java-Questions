import java.util.*;
import java.io.*;

public class Q3 {
    public static void main(String[] args){
        String source=readFile("C:\\Users\\user\\IdeaProjects\\BasicJavaImplementation\\src\\Q1.java");
        System.out.println(source.replaceAll("(?:/\\*(?:[^*]|(?:\\*[^*/]))*\\*+/)|(?://.*)",""));

    }
    static String readFile(String fileName){
        File file=new File(fileName);
        char[] buffer=null;
        try{
            BufferedReader reader=new BufferedReader(new FileReader(file));
            buffer=new char[(int)file.length()];  //file.length is no. of lines in the file; buffer is character array of this length
            int i=0;
            int c=reader.read();  //c = no. of characters in current line
            while (c != -1) {
                buffer[i++]=(char)c;  //buffer array stores no. of characters in each line
                c=reader.read();

            }
            }catch(IOException e){
            e.printStackTrace();
        }
        return new String(buffer);
    }
}
