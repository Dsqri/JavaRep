
import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {
        // Demonstrating Arrays
        System.out.println("Array Example:");
        int[] numbersArray = new int[3]; // Fixed size of 3
        numbersArray[0] = 10;
        numbersArray[1] = 20;
        numbersArray[2] = 30;
        System.out.println("Array elements:");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println("Element at index " + i + ": " + numbersArray[i]);
        }
        // Demonstrating Array
        System.out.println("\nArrayList Example:");
        ArrayList<Integer> numbersArrayList = new ArrayList<>(); // Dynamic size
        numbersArrayList.add(10);
        numbersArrayList.add(20);
        numbersArrayList.add(30);
  
        System.out.println("ArrayList elements:");
        for (int i = 0; i < numbersArrayList.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbersArrayList.get(i));
        }

        // Adding more elements to Array
        numbersArrayList.add(40);
        System.out.println("\nArrayList after adding an element:");
        for (int i = 0; i < numbersArrayList.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbersArrayList.get(i));
        }
    }
}