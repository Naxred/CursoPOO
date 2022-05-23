package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car("QWERTY123", new Account("Andres Herrera", "ASDFGHJ123"));
        car.passegenger = 4;
        //System.out.println("Car license: " + car.license);
        car.printDataCar();

        Car car2 = new Car("ASDLFK#%", new Account("Alex Fernandez", "9854125"));
        car2.passegenger = 3;
        car2.printDataCar();

    }
}