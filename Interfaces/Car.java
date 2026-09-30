interface Vehicle {

    void start();

    void stop();
}

abstract class Car implements Vehicle {

    public void start() {
        System.out.println("Car started");
    }

    public static void main(String[] args) {

        Car obj = new Car() {
            public void stop() {
                System.out.println("Car stopped");
            }
        };

        obj.start();
    }
}