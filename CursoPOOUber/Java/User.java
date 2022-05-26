package Java;

class User extends Account{
    public User(Integer id, String name, String document, String email, String password){
        super(name, document, email, password);
    }

    void PrintDataUser(){
        System.out.println("Name User: " + name + "\nDocument User: " + document + "\nEmail User: "
        + email + "\nPassword User: " + password);
    }
    
}
