class A {

    int number = 10;
}

class B extends A {

    int number = 20;
}

class C extends B {

    int number = 30;
}

public class DataMemberPolymorphism {

    public static void main(String[] args) {

        A objA = new A();
        B objB = new B();
        C objC = new C();

        System.out.println("Using own objects:");
        System.out.println("A number: " + objA.number);
        System.out.println("B number: " + objB.number);
        System.out.println("C number: " + objC.number);

        System.out.println("\nUsing parent references:");

        A refB = new B();
        A refC = new C();

        System.out.println("B object using A reference: " + refB.number);
        System.out.println("C object using A reference: " + refC.number);
    }
}