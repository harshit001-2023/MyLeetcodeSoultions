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

    public static ArrayList<Integer> filterEvenList(ArrayList<Integer> originalList){
        //Handling the edge case original list should not be empty
        if(originalList.isEmpty()){
            throw new RuntimeException("List is Empty, please fill the valid elements");
        }
        //Creating an empty array list to store the even numbers
        ArrayList<Integer> evenList = new ArrayList<>();

        //Iterating over each element and checking whether it is even or not
        for(int num : originalList){
            if(num%2==0){
                //adding even numbers to the empty list
                evenList.add(num);
            }
        }

        // Returning the even element list
        return evenList;
    }

    public static int evenElementSum(ArrayList<Integer> list){
        //Edge case, list should not be empty
        if(list.isEmpty()){
            throw new RuntimeException("Empty List, no further move");
        }

        //A variable with first element of list
        int evenSum = 0;

        //Iterating each number and checking whether even or not and if even summing them
        for(int num: list){
            if(num%2==0){
                evenSum += num;
            }
        }

        //Returning the variable
        return evenSum;
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
//        int largest = findLargestNumber(list);
//        ArrayList<Integer>  evenNumbers = filterEvenList(list);
        int evenSum = evenElementSum(list);

        // Print the result here
//        System.out.println("The sum of the list is: " + total);
//        System.out.println("Largest number is: "+largest);
//        System.out.println("Even elements are "+evenNumbers);
        System.out.println("Sum of even element in Array List is "+evenSum);
    }
}
