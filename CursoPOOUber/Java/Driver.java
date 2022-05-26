package Java;

class Driver extends Account{
    public Driver(Integer id, String name, String document, String email, String password){
        super(name, document, email, password);
    }

    void PrintDataDriver(){
        System.out.println("Name Driver: " + name + "\nDocument Driver: " + document + "\nEmail Driver: "
        + email + "\nPassword Driver: " + password);
    }
    
}
