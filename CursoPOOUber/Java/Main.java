package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car();
        car.license = "QWERTY123";
        car.driver = "Andres Herrera";
        car.passegenger = 4;
        //System.out.println("Car license: " + car.license);
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "TREWQP569";
        car2.driver = "Jimena Acosta";
        car2.passegenger = 3;
        //System.out.println("Car license: " + car2.license);
        car2.printDataCar();

    }
}