class LogicalOperators {

    public static void main(String[] args) {

        int age = 22;
        boolean student = true;

        System.out.println("AND: " + (age > 18 && student));
        System.out.println("OR: " + (age > 18 || student));
        System.out.println("NOT: " + !(age > 18));
    }
}