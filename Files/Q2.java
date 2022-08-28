import java.util.*;
import java.io.*;
public class Q2 {
    public static void main(String[] args){
        ArrayList<String> filecontents=loadstringfromfile();
        Scanner s=new Scanner(System.in);
        String inputLine=s.nextLine();
        System.out.println(isPrefixMatches(inputLine,filecontents));
    }
    private static boolean isPrefixMatches(String inputLine, ArrayList<String> fileContents){
        for(String content:fileContents){
            if(inputLine.startsWith(content)){
                return true;
            }
        }
        return false;
    }
    private static ArrayList<String> loadstringfromfile(){
        ArrayList<String> fileContents=new ArrayList<>();
        BufferedReader reader=null;
        try{
            reader=new BufferedReader(new FileReader("F:\\input2.txt"));
            String currentLine=reader.readLine();
            while (currentLine!=null){
                if(!isLineEmpty(currentLine)){
                    fileContents.add(currentLine);
                    currentLine=reader.readLine();
                }
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return fileContents;
    }

    private static boolean isLineEmpty(String currentLine) {
        return "".equals(currentLine);
    }

}
