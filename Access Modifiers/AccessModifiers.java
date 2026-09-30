class AccessModifiers {

    private int privateNumber = 10;
    int defaultNumber = 20;
    protected int protectedNumber = 30;
    public int publicNumber = 40;

    private void privateMethod() {
        System.out.println("Private method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    public void publicMethod() {
        System.out.println("Public method");
    }

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();

        System.out.println("Private: " + obj.privateNumber);
        System.out.println("Default: " + obj.defaultNumber);
        System.out.println("Protected: " + obj.protectedNumber);
        System.out.println("Public: " + obj.publicNumber);

        obj.privateMethod();
        obj.defaultMethod();
        obj.protectedMethod();
        obj.publicMethod();
    }
}

class Child extends AccessModifiers {

    void show() {

        // privateNumber cannot be accessed here

        System.out.println("Default: " + defaultNumber);
        System.out.println("Protected: " + protectedNumber);
        System.out.println("Public: " + publicNumber);

        defaultMethod();
        protectedMethod();
        publicMethod();

        System.out.println("Private members cannot be accessed in child class.");
    }
}