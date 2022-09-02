import java.util.*;
import java.io.*;

public class DuplicateStrings {
    public static void main(String[] args){
        String[] inputSet={"raudra", "ravi", "java", "ravula", "ravi", "ravula"};
        System.out.println(countNumberOfDuplicates(inputSet));
    }

    private static int countNumberOfDuplicates(String[] inputSet){
        int countDuplicates=0;
        HashSet<String> stringHashSet=new HashSet<>();
        for(String inputString : inputSet){
            if(!stringHashSet.add(inputString)){
                countDuplicates++;
            }
        }
        return countDuplicates;
    }
}
