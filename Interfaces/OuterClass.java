class OuterClass {

    private interface MyInterface {

        int number = 100;

        void display();
    }

    static class Test implements MyInterface {

        public void display() {
            System.out.println("Interface method");
        }
    }

    public static void main(String[] args) {

        Test obj = new Test();

        System.out.println("Number: " + MyInterface.number);

        obj.display();
    }
}