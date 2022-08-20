import java.util.*;
import java.io.*;
import java.lang.*;

public class StringSort {
    public static void main(String[] args){
        String words;
        System.out.print("Enter String: ");
        Scanner s=new Scanner(System.in);
        words=s.nextLine();
        char[] word=words.toCharArray();

        for(int i=0; i<word.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(word[j]<word[j-1]){
                    char temp=word[j-1];
                    word[j-1]=word[j];
                    word[j]=temp;
                }
            }
        }
        words=String.valueOf(word);
        System.out.println(words);
    }
}
