class OverloadingOne {

    void add(int a) {
        System.out.println("One parameter: " + a);
    }

    void add(int a, int b) {
        System.out.println("Two parameters: " + (a + b));
    }

    public static void main(String[] args) {

        OverloadingOne obj = new OverloadingOne();

        obj.add(10);
        obj.add(10, 20);
    }
}