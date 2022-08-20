import java.util.*;
public class reverseWords {
    public static void main(String[] args){
        System.out.print("Enter String: ");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        StringBuffer br=new StringBuffer(str);
        StringTokenizer st=new StringTokenizer(br.reverse().toString()," ");
        System.out.println("Reversed words: ");
        while(st.hasMoreTokens()){
            StringBuffer sb=new StringBuffer(st.nextToken());
            System.out.println(" "+sb.reverse());
        }
    }
}
