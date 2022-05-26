package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car("QWERTY123", new Account("Andres Herrera", "ASDFGHJ123", "andres@gmail.com", "contraseña"));
        car.passegenger = 4;
        //System.out.println("Car license: " + car.license);
        car.printDataCar();

        Car car2 = new Car("ASDLFK#%", new Account("Alex Fernandez", "9854125", "alex@gmail.com", "contraseña2"));
        car2.passegenger = 3;
        car2.printDataCar();

        User primer_usuario = new User(100, "Isaac Uresti", "1923148", "rexkid2001@gmail.com", "qwerty123");
        primer_usuario.PrintDataUser();

        System.out.println("*****************************************");

        Driver primer_conductor = new Driver(200, "Jose Emilio Pacheco", "1874589", "jose@gmai.com", "vegetta777");
        primer_conductor.PrintDataDriver();

    }
}