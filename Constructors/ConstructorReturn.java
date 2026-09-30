class ConstructorReturn {

    ConstructorReturn() {
        System.out.println("This is a constructor");
    }

    int getNumber() {
        return 100;
    }

    String getName() {
        return "Yogesh";
    }

    public static void main(String[] args) {

        ConstructorReturn obj = new ConstructorReturn();

        System.out.println("Number: " + obj.getNumber());
        System.out.println("Name: " + obj.getName());
    }
}