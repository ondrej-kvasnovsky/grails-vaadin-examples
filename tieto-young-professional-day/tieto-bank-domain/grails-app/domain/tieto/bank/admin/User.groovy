package tieto.bank.admin

class User {

    String name
    
    static constraints = {
    }

    @Override
    public String toString() {
        return "User [name=" + name + "]";
    }    
    
}
