class ConstructorAccess {

    public ConstructorAccess() {
        System.out.println("Public constructor");
    }

    protected ConstructorAccess(int number) {
        System.out.println("Protected constructor: " + number);
    }

    ConstructorAccess(String name) {
        System.out.println("Default constructor: " + name);
    }

    private ConstructorAccess(double salary) {
        System.out.println("Private constructor: " + salary);
    }

    public static void main(String[] args) {

        ConstructorAccess obj1 = new ConstructorAccess();
        ConstructorAccess obj2 = new ConstructorAccess(100);
        ConstructorAccess obj3 = new ConstructorAccess("Yogesh");
        ConstructorAccess obj4 = new ConstructorAccess(25000.50);
    }
}