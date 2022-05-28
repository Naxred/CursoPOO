package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        // UberX uberX = new UberX("QWERTY123", new Account("Andres Herrera", "ASDFGHJ123", "andres@gmail.com", "contraseña"), "Chevrolet", "Cruze");
        // // uberX.passegenger = 3;
        // //System.out.println("Car license: " + car.license);
        // uberX.setPassanger(4);
        // uberX.printDataCar();

        UberVan uberVan = new UberVan("HTYM452", new Account("Miguel Layun", "QWERTY", "Miguel@gmail.com", "FRUTAS777"));
        uberVan.setPassanger(6);
        uberVan.printDataCar();

        // Car car2 = new Car("ASDLFK#%", new Account("Alex Fernandez", "9854125", "alex@gmail.com", "contraseña2"));
        // car2.passegenger = 3;
        // car2.printDataCar();

        // User primer_usuario = new User(100, "Isaac Uresti", "1923148", "rexkid2001@gmail.com", "qwerty123");
        // primer_usuario.PrintDataUser();

        // System.out.println("*****************************************");

        // Driver primer_conductor = new Driver(200, "Jose Emilio Pacheco", "1874589", "jose@gmai.com", "vegetta777");
        // primer_conductor.PrintDataDriver();

    }
}