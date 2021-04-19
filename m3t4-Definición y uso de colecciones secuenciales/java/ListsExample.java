import java.util.ArrayList;
import java.util.Collections;

public class ListsExample 
{
    public static void main (String[] args) {

        // Create a list
        ArrayList<Integer> myList = new ArrayList<Integer>();

        // Add elements
        myList.add(5);
        myList.add(3);
        myList.add(8);
        myList.add(7);

        printList("", myList);

        // Insert element
        myList.add(2, 1);
        printList("", myList);

        // Change element
        myList.set(0, 4);
        printList("", myList);

        // Returns the index of the first element with the specified value
        System.out.println("Index of value 3: " + myList.indexOf(3));

        // Returns the value in a specified index
        System.out.println("Value with index 1:" + myList.get(1));
        
        // Returns the index of the first element with the specified value
        System.out.println("List size: " + myList.size());

        // Sorts the list
        Collections.sort(myList);
        printList("", myList);

        // Reverse the order of the list
        Collections.sort(myList, Collections.reverseOrder());
        printList("", myList);

        // Remove element
        myList.remove(Integer.valueOf(7));
        printList("", myList);

        // Remove specified index
        myList.remove(1);
        printList("", myList);

        // Returns a copy of the list
        ArrayList<Integer> myNewList = (ArrayList<Integer>) myList.clone();
        printList("My new list: ", myNewList);

        // Removes all the elements from the list
        myList.clear();
        printList("My list:", myList);
        printList("My new list: ", myNewList);
    }

    private static void printList(String previousText, ArrayList<Integer> myList) {
        previousText = previousText.isBlank() ? "" : previousText + " ";
        System.out.println(previousText + createListString(myList));
    }

    private static String createListString(ArrayList<Integer> myList) {

        if (myList.size() < 1) return "[]";

        String result = "";

        for (int i = 0; i < myList.size(); i++) {
            result += myList.get(i).toString() + ", ";
        }

        return "[" + result.substring(0, result.length() - 2) + "]";
        
    }
}

