package Java;

class Car {
    private Integer id;
    private String license;
    private Account driver;
    protected Integer passegenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;        
    }

    void printDataCar(){
        if(passegenger != null){
            System.out.println("License: " + license + " Name Driver: " + driver.name  + " Passengers: " + passegenger);
        }
        
    }

    public Integer getPassanger(){
        return passegenger;
    }

    public void setPassanger(Integer passanger) {
        if(passanger == 4){
            this.passegenger = passanger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
        
    }
}
