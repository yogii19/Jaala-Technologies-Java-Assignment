import java.util.HashSet;

class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        // Add 10 elements
        set.add("Java");
        set.add("Python");
        set.add("C");
        set.add("C++");
        set.add("HTML");
        set.add("CSS");
        set.add("JavaScript");
        set.add("React");
        set.add("Spring");
        set.add("MySQL");

        System.out.println("HashSet: " + set);

        // Add an element
        set.add("MongoDB");
        System.out.println("After adding: " + set);

        // Add duplicate element
        set.add("Java");
        System.out.println("After adding duplicate Java: " + set);

        // Check element
        System.out.println("Contains Java: " +
                set.contains("Java"));

        // Remove element
        set.remove("C");
        System.out.println("After removing C: " + set);

        // Size
        System.out.println("Size of HashSet: " + set.size());

        // Check if empty
        System.out.println("Is HashSet empty: " +
                set.isEmpty());

        // Iterate HashSet
        System.out.println("HashSet elements:");
        for (String value : set) {
            System.out.println(value);
        }

        // Create another HashSet
        HashSet<String> anotherSet = new HashSet<String>();
        anotherSet.add("Java");
        anotherSet.add("Python");
        anotherSet.add("Spring");

        // Add all elements
        set.addAll(anotherSet);
        System.out.println("After addAll: " + set);

        // Check common elements
        set.retainAll(anotherSet);
        System.out.println("Common elements: " + set);

        // Remove all elements
        set.clear();
        System.out.println("After clear: " + set);
    }
}