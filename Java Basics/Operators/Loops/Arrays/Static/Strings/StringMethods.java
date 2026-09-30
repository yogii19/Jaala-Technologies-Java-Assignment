class StringMethods {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "java";

        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2));
        System.out.println("Starts With: " + str1.startsWith("Ja"));
        System.out.println("Ends With: " + str1.endsWith("va"));
        System.out.println("Compare To: " + str1.compareTo(str2));
    }
}