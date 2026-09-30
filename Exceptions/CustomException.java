class MyException extends Exception {

    MyException(String message) {
        super(message);
    }
}

class CustomException {

    public static void main(String[] args) {

        try {

            int age = 15;

            if (age < 18) {
                throw new MyException("Age is below 18");
            }

            System.out.println("Eligible");

        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}