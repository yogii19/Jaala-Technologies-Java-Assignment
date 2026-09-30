interface VehicleType {

    default void start() {
        System.out.println("Vehicle started");
    }
}

class CarType implements VehicleType {

    public static void main(String[] args) {

        CarType obj = new CarType();

        obj.start();
    }
}