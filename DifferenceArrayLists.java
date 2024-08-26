import java.util.ArrayList;

public class DifferenceArrayLists {

    public static void main(String[] args) {
        // Demonstrating Arrays
        System.out.println("Array Example:");
        String[] wondersArray = new String[3]; // Fixed size of 3

        // Assigning values (for demonstration purposes, just using a few wonders)
        wondersArray[0] = "Great Pyramid of Giza";
        wondersArray[1] = "Hanging Gardens of Babylon";
        wondersArray[2] = "Statue of Zeus at Olympia";

        System.out.println("Array elements:");
        for (int i = 0; i < wondersArray.length; i++) {
            System.out.println("Element at index " + i + ": " + wondersArray[i]);
        }

        // Demonstrating ArrayLists
        System.out.println("\nArrayList Example:");
        ArrayList<String> wondersArrayList = new ArrayList<>(); // Dynamic size

        // Adding elements to the ArrayList
        wondersArrayList.add("Great Pyramid of Giza");
        wondersArrayList.add("Hanging Gardens of Babylon");
        wondersArrayList.add("Statue of Zeus at Olympia");
        wondersArrayList.add("Temple of Artemis at Ephesus");

        System.out.println("ArrayList elements:");
        for (int i = 0; i < wondersArrayList.size(); i++) {
            System.out.println("Element at index " + i + ": " + wondersArrayList.get(i));
        }

        // Adding more elements to ArrayList
        wondersArrayList.add("Colossus of Rhodes");

        System.out.println("\nArrayList after adding more elements:");
        for (int i = 0; i < wondersArrayList.size(); i++) {
            System.out.println("Element at index " + i + ": " + wondersArrayList.get(i));
        }
    }
}
