import java.util.ArrayList;
import java.util.Iterator;

class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        // Add 10 elements
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");
        list.add("HTML");
        list.add("CSS");
        list.add("JavaScript");
        list.add("React");
        list.add("Spring");
        list.add("MySQL");

        // Add an element
        list.add("MongoDB");
        System.out.println("After adding: " + list);

        // Iterate using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Add at specific index
        list.add(2, "Angular");
        System.out.println("After adding at index 2: " + list);

        // Remove an element
        list.remove("C");
        System.out.println("After removing C: " + list);

        // Remove at an index
        list.remove(3);
        System.out.println("After removing index 3: " + list);

        // Update element at specific index
        list.set(1, "Python Programming");
        System.out.println("After updating index 1: " + list);

        // Check element at particular index
        System.out.println("Element at index 2: " + list.get(2));

        // Get element at particular index
        System.out.println("Element at index 4: " + list.get(4));

        // Size
        System.out.println("Size of ArrayList: " + list.size());

        // Check element is present
        System.out.println("Contains Java: " + list.contains("Java"));

        // Remove all elements
        list.clear();
        System.out.println("After removing all elements: " + list);
    }
}