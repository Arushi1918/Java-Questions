/* (Count positive and negative numbers and compute the average of numbers) Write
        a program that reads an unspecified number of integers, determines how many
        positive and negative values have been read, and computes the total and average of
        the input values (not counting zeros). Your program ends with the input 0. Display
        the average as a floating-point number*/

import java.util.*;
public class Count_Avg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int positives = 0;
        int negatives = 0;
        int count = 0;
        double total = 0;

        System.out.println("Enter a no. & 0 to end: ");
        int no = s.nextInt();

        if (no == 0) { //Test for sentinel value
            System.out.println("No numbers are entered except 0.");
            System.exit(1);
        }

        while (no != 0)//Test for sentinel value
        {
            if (no > 0)
                positives++;
            else
                negatives++;
            total += no;
            count++;
            no = s.nextInt();
        }

        double average = total / count;
        System.out.println(" Positive numbers: "+positives+"\n Negative numbers: "
                +negatives+"\n Total: "+total+"\n Average: "+average);
    }
}
