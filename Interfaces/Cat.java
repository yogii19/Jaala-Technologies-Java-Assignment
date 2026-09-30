interface AnimalType {

    void sound();
}

class Cat implements AnimalType {

    public void sound() {
        System.out.println("Cat makes a sound");
    }

    public static void main(String[] args) {

        AnimalType obj = new Cat();

        obj.sound();
    }
}