class ParentMethod {

    int number = 100;

    void display() {

        System.out.println("Parent method");
    }
}

class ChildMethod extends ParentMethod {

    int number = 200;

    void show() {

        System.out.println("Current class number: " + this.number);
        System.out.println("Parent class number: " + super.number);

        this.displayChild();
        super.display();
    }

    void displayChild() {

        System.out.println("Child method");
    }

    public static void main(String[] args) {

        ChildMethod obj = new ChildMethod();

        obj.show();
    }
}