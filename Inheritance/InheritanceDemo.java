class A {

    void methodA1() {
        System.out.println("Method A1 from Class A");
    }

    void methodA2() {
        System.out.println("Method A2 from Class A");
    }

    void display() {
        System.out.println("Display method from Class A");
    }
}

class B extends A {

    void methodB1() {
        System.out.println("Method B1 from Class B");
    }

    void methodB2() {
        System.out.println("Method B2 from Class B");
    }

    @Override
    void display() {
        System.out.println("Display method from Class B");
    }
}

class C extends B {

    void methodC1() {
        System.out.println("Method C1 from Class C");
    }

    void methodC2() {
        System.out.println("Method C2 from Class C");
    }

    @Override
    void display() {
        System.out.println("Display method from Class C");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        A objA = new A();
        B objB = new B();
        C objC = new C();

        System.out.println("Class A:");
        objA.methodA1();
        objA.methodA2();
        objA.display();

        System.out.println("\nClass B:");
        objB.methodA1();
        objB.methodA2();
        objB.methodB1();
        objB.methodB2();
        objB.display();

        System.out.println("\nClass C:");
        objC.methodA1();
        objC.methodA2();
        objC.methodB1();
        objC.methodB2();
        objC.methodC1();
        objC.methodC2();
        objC.display();

        System.out.println("\nRuntime Polymorphism:");

        A refB = new B();
        A refC = new C();

        refB.display();
        refC.display();
    }
}