import java.util.HashMap;

class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<Integer, String>();

        // Add 10 key-value pairs
        students.put(101, "Yogesh");
        students.put(102, "Rahul");
        students.put(103, "Amit");
        students.put(104, "Rohit");
        students.put(105, "Akash");
        students.put(106, "Vijay");
        students.put(107, "Kiran");
        students.put(108, "Suresh");
        students.put(109, "Prakash");
        students.put(110, "Raj");

        // Insert a key-value mapping
        students.put(111, "Arjun");

        System.out.println("HashMap: " + students);

        // Fetch value using key
        System.out.println("Student with ID 101: " + students.get(101));

        // Clone / copy HashMap
        HashMap<Integer, String> cloneMap =
                new HashMap<Integer, String>(students);
        System.out.println("Cloned Map: " + cloneMap);

        // Check key
        System.out.println("Key 105 present: " +
                students.containsKey(105));

        // Check value
        System.out.println("Value Yogesh present: " +
                students.containsValue("Yogesh"));

        // Check if map is empty
        System.out.println("Map is empty: " +
                students.isEmpty());

        // Size
        System.out.println("Map size: " + students.size());

        // Print all keys
        System.out.println("All Keys:");
        for (Integer key : students.keySet()) {
            System.out.println(key);
        }

        // Print all values
        System.out.println("All Values:");
        for (String value : students.values()) {
            System.out.println(value);
        }

        // Remove specific key-value pair
        students.remove(111);
        System.out.println("After removing ID 111: " + students);

        // Copy all elements to another Map
        HashMap<Integer, String> anotherMap =
                new HashMap<Integer, String>();

        anotherMap.putAll(students);

        System.out.println("Another Map: " + anotherMap);
    }
}