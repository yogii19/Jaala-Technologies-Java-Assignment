class ParentClass {

    ParentClass() {

        System.out.println("Parent constructor called");
    }
}

class ChildClass extends ParentClass {

    ChildClass() {

        super();

        System.out.println("Child constructor called");
    }

    public static void main(String[] args) {

        ChildClass obj = new ChildClass();
    }
}