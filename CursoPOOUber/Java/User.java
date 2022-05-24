package Java;

class User extends Account{
    public User(Integer id, String name, String document, String email, String password){
        super(name, document, email, password);
    }

    void PrintDataUser(){
        System.out.println("Name Driver: " + name + "\nDocument Driver: " + document + "\nEmail Driver: "
        + email + "\nPassword Driver: " + password);
    }
    
}
