class VariableScope {

    int number = 100;   // Global variable

    void display() {

        int number = 50;   // Local variable

        System.out.println("Local variable: " + number);
        System.out.println("Global variable: " + this.number);
    }

    public static void main(String[] args) {

        VariableScope obj = new VariableScope();
        obj.display();
    }
}