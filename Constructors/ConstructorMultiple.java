class ConstructorMultiple {

    ConstructorMultiple() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {

        ConstructorMultiple obj = new ConstructorMultiple();

        // Constructor cannot be called again using the same object.

        System.out.println("Same object cannot call constructor again.");
    }
}