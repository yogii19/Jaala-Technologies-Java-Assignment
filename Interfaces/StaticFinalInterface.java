interface Constants {

    static final int NUMBER = 100;
}

class StaticFinalInterface implements Constants {

    public static void main(String[] args) {

        System.out.println("Number: " + Constants.NUMBER);
    }
}