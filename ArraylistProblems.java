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
        int total = summingUp(list);

        // Print the result here
        System.out.println("The sum of the list is: " + total);
    }
}
