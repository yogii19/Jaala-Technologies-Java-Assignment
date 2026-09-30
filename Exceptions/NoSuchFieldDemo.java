class TestField {
    
    int number = 10;
}

class NoSuchFieldDemo {

    public static void main(String[] args) throws NoSuchFieldException {

        TestField.class.getField("abc");
    }
}