import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array elements separated by space:");
        String arr = s.nextLine();
        String[] array = arr.split(" ");
        printnumbers(array);
        insertionsort(array);
        printnumbers(array);
    }

    private static void printnumbers(String[] arr) {
        for (String e : arr) {
            System.out.print(e + ",");
        }
        System.out.println("\n");
    }

    public static void insertionsort(String[] arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            try {
                for (int j = i + 1; j < arr.length; j++) {
                    if (Integer.parseInt(arr[j]) < Integer.parseInt(arr[min])) {
                        min = j;
                    }
                }
                String temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            } catch (Exception e) {
                System.out.println("Invalid Entry");
            }
        }
    }
}
