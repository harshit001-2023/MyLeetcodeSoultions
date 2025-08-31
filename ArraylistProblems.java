import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistProblems {
    public static int summingUp(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number; // Using the shorthand operator
        }
        return sum; // It's often better to return the value and print in main
    }

    public static int findLargestNumber(ArrayList<Integer> numbers) {
        // Step 1: Handle the edge case of an empty list
        if (numbers.isEmpty()) {
            // It's good practice to handle this case. We can't find a largest number!
            // We'll throw an exception to signal an error.
            throw new IllegalArgumentException("Input list cannot be empty.");
        }

        // Step 2: Initialize with the first element (your idea!)
        int largestNumber = numbers.get(0);

        // Step 3: Loop through all numbers
        for (int i : numbers) {
            // Step 4: Compare and update if we find a bigger number
            if (i > largestNumber) {
                largestNumber = i;
            }
        }

        // Step 5: Return the final answer
        return largestNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
/*        list.add(12);
        list.add(10);
        list.add(10);
        list.add(20);*/

        System.out.println("Enter the elements to be added in Arraylist, enter a letter to finish");
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            list.add(num);
        }

        // Call the method and store the result
//        int total = summingUp(list);
        int largest = findLargestNumber(list);

        // Print the result here
//        System.out.println("The sum of the list is: " + total);
        System.out.println("Largest number is: "+largest);
    }
}
