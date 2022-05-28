package Java;

import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver){
        super(license, driver);
    }

    @Override
    public void setPassanger(Integer passanger) {
        if(passanger == 6){
            this.passegenger = passanger;
        }else{
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }
}