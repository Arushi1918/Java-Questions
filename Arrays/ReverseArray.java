import java.util.*;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n=s.nextInt();
        int[] numbers=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n; i++){
            numbers[i]=s.nextInt();
        }
        reverseArray(numbers,0,numbers.length-1);
        System.out.println("Reverse Array is: ");
        printArray(numbers);
    }

    static void printArray(int[] array){
        for(int i=0; i< array.length; i++){
            System.out.println(array[i]+" ");
        }
        System.out.println("");
    }

    static void reverseArray(int[] array, int start, int end){
        if(start>=end)
            return;
        swap(array,start,end);
        reverseArray(array,start+1, end-1);
    }

    public static void swap(int[] array, int i, int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
