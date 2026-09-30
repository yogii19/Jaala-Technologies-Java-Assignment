interface Printable {

    void print();
}

interface Showable {

    void show();
}

class Display implements Printable, Showable {

    public void print() {
        System.out.println("Print method");
    }

    public void show() {
        System.out.println("Show method");
    }

    public static void main(String[] args) {

        Display obj = new Display();

        obj.print();
        obj.show();
    }
}