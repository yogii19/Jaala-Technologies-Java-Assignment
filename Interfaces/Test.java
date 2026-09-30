interface First {

    void display();
}

interface Second {

    void display();
}

class Test implements First, Second {

    public void display() {
        System.out.println("Display method implemented once");
    }

    public static void main(String[] args) {

        Test obj = new Test();

        obj.display();
    }
}