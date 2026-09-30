class TestMethod {

    public void display() {
        System.out.println("Display method");
    }
}

class NoSuchMethodDemo {

    public static void main(String[] args) throws NoSuchMethodException {

        TestMethod.class.getMethod("abc");
    }
}